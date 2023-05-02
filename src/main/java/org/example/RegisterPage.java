package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    private By _FirstName=By.id("FirstName");
    private By _LastName=By.id("LastName");
    private By _email=By.name("Email");
    private By _Password=By.id("Password");
    private By _ConfirmPassword=By.id("ConfirmPassword");
    private By _RegisterButton=By.id("register-button");

    private By _continueButton=By.xpath("//a[@class='button-1 register-continue-button']");
    public void registerDetails(){
    typeTextFromElement(_FirstName,"Umar");
    typeTextFromElement(_LastName,"Sahal");
    typeTextFromElement(_email,"lia"+timeStamp()+"@gmail.com");
    typeTextFromElement(_Password,"hd12345");
    typeTextFromElement(_ConfirmPassword,"hd12345");
    clickOnElement(_RegisterButton);

    }
    public void continueAfterRegistration(){
        clickOnElement(_continueButton);

    }
}
