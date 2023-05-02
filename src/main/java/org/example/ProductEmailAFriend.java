package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriend extends Utils {

    private By _friendsEmail=By.xpath("//input[contains(@id,'FriendEmail')]");
    private By _yourEmail=By.xpath("//input[contains(@id,'YourEmailAddress')]");
    private  By _sendEmail=By.xpath("//button[contains(@name,'send-email')]");
    private  By _errorResult=By.xpath("//div[contains(@class,'message-error validation')]/ul");
    private By _sentMessage=By.xpath("//div[@class=\"master-column-wrapper\"]/div/div/div[@class=\"page-body\"]/div[2]");
    public void emailAFriendDetails(){

        typeTextFromElement(_friendsEmail,"friend"+timeStamp()+"@gmail.com");
        typeTextFromElement(_yourEmail,"test"+timeStamp()+"@gmail.com");
        clickOnElement(_sendEmail);}
         String expectedErrorResult="Only registered user can send message to a friend";
        public void errorMessage(){

        Assert.assertEquals(getTextFromElement(_errorResult),expectedErrorResult);

    }

}
