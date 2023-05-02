package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils {
    private By _loginEmail=By.id("Email");
    private By _loginPassword=By.id("Password");
    private By _loninButton=By.xpath("//button[@class='button-1 login-button']");

    public void loginDetails(){

        typeTextFromElement(_loginEmail,"lia"+timeStamp()+"@gmail.com");

        typeTextFromElement(_loginPassword,"hd12345");
        waitForElementToBeClickable(_loninButton,15);
        clickOnElement(_loninButton);

    }

}
