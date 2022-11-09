package com.example.demo;

import Base.BaseStepMetod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.amazon.com/
public class AmazonPage extends BaseStepMetod {

    public AmazonPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    private static final By INPUT_SEARCH_BOX = By.cssSelector("input[id='nav-bb-search']");
    private static final By TXT_RESULT_TEXT =By.cssSelector("input[id='nav-bb-search']");

    public void searchBox(String text){
setTextElement(INPUT_SEARCH_BOX,text+ Keys.ENTER);

    }
    public void AssertResultText(String resultText){
        ContainsText(TXT_RESULT_TEXT,resultText);
    }
}