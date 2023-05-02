package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AppleMacbookProPage extends Utils {
    private By _emailAFriendButton=By.xpath("//div[@class=\"overview-buttons\"]/div[3]");

public void emailAFriend(){
    waitForElementToBeClickable(_emailAFriendButton,15);
   clickOnElement(_emailAFriendButton);
}

}
