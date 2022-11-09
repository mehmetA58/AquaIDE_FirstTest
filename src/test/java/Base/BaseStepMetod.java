package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BaseStepMetod {
    public static WebDriver driver;
    private WebDriverWait wait;
    //Constructor
    public void BaseStepMethod() {

        WebDriverWait wait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    protected WebElement waitVisibleByLocator(By locator) {
        WebElement element = null;

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {

        }
        return element;
    }
    protected WebElement waitClickableByOfElement(WebElement webElement) {
        WebElement element = null;

        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        } catch (Exception e) {

        }
        return element;
    }
    protected WebElement waitPresenceOfElementByLocator(By locator) {
        WebElement element = null;

        try {
            element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {

        }
        return element;
    }



    protected String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    protected void clickElement(By locator) {
        WebElement element = this.waitVisibleByLocator(locator);
        waitClickableByOfElement(element).click();
    }
    protected WebElement setTextElement(By locator, String text) {
        WebElement element = waitPresenceOfElementByLocator(locator);
        element.clear();
        element.sendKeys(text);

        return element;
    }
    protected String getTextElement(By locator) {
        return waitPresenceOfElementByLocator(locator).getText();
    }
    protected void ContainsText(By locator,String text){
        Assert.assertTrue(getTextElement(locator).contains(text));
    }
}
