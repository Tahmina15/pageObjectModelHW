package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterPage extends Utils {
    private By _FirstName=By.id("FirstName");
    private By _LastName=By.id("LastName");
    private By _email=By.name("Email");
    private By _Password=By.id("Password");
    private By _ConfirmPassword=By.id("ConfirmPassword");
    private By _RegisterButton=By.id("register-button");

    private By _continueButton=By.xpath("//a[@class='button-1 register-continue-button']");
    private By _birthDate=By.xpath("//select[@name='DateOfBirthDay']");
    private By _birthMonth=By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthYear=By.xpath("//select[@name='DateOfBirthYear']");
    public void registerDetails(){
    typeTextFromElement(_FirstName,"Umar");
    typeTextFromElement(_LastName,"Sahal");
    //waitForElementToBeVisible(_birthDate,20);
    selectFromDropdownVisibleText(_birthDate,"20");
    //waitForElementToBeVisible(_birthMonth,20);
    selectFromDropdownVisibleText(_birthMonth,"May");
    //waitForElementToBeVisible(_birthYear,20);
   selectFromDropdownVisibleText(_birthYear,"1994");
    typeTextFromElement(_email,"lia"+timeStamp()+"@gmail.com");
    typeTextFromElement(_Password,"hd12345");
    typeTextFromElement(_ConfirmPassword,"hd12345");
    clickOnElement(_RegisterButton);

    }
    public void continueAfterRegistration(){
        clickOnElement(_continueButton);



}}
