package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProducts extends Utils {


    private By _productName1=By.xpath("//div[@class=table-wrapper]/table/tbody/tr[3]/td[2]/a");
    private By _productName2=By.xpath("//div[@class=table-wrapper]/table/tbody/tr[3]/td[3]/a");
    private By _clearList=By.xpath("//a[@class=\"clear-list\"]");
    private By _clearmessage=By.xpath("//div[contains(@class,'no-data')]");
    String firstProductName="HTC";
    String secondProductName="Virtual gift card";
    String expectedMessage="You have no items to compare.";
    public void compareProductDetails(){


        waitForElementToBeClickable(_clearList,20);
        clickOnElement(_clearList);

       Assert.assertEquals(getTextFromElement(_clearmessage),expectedMessage);



    }
}
