package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonTest {
    private WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");

    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void Test(){
AmazonPage amazonPage=new AmazonPage(driver);
amazonPage.searchBox("Aqua");
amazonPage.AssertResultText("Aqua");

    }
}
