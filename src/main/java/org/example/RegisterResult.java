package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;

public class RegisterResult extends Utils{
    private By _result=By.className("result");
    String expectedMessage="Your registration completed";
    public void verifyUserShouldRegisterSuccessfully(){
        Assert.assertEquals(getTextFromElement(_result),expectedMessage);

    }



}
