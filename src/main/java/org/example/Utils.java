package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;


public class Utils extends BasePage{
    public static void clickOnElement(By by){
     driver.findElement(by).click();
    }
    public static void typeTextFromElement(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static long timeStamp(){
        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void waitForElementToBeClickable(By by,int duration){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
      wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public static void waitForElementToBeVisible(By by,int duration){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public static void waitforInvisibleElement(By by,int duration){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
}
