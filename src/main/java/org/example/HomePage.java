package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends Utils {
    private By _register = By.className("ico-register");

    //method for click on register button
    public void clickOnRegister() {
        clickOnElement(_register);
    }

    private By _good = By.id("pollanswers-2");
    private By _vote = By.id("vote-poll-1");
    private By _voteResult = By.id("block-poll-vote-error-1");
    String expectedVoteResult = "Only registered users can vote.";

    public void clickOnGoodOption() {
        clickOnElement(_good);
    }

    public void clickOnVote() {
        clickOnElement(_vote);
    }

    public void getTextFromVoteResult() {
       waitforInvisibleElement(_voteResult,10);
        Assert.assertEquals(getTextFromElement(_voteResult), expectedVoteResult);
    }


    private By _HTCCompare = By.xpath("//div[@class='item-box'][3]/div/div[2]/div[3]/div[2]/button[2]");
    private By _virtualgiftCard = By.xpath("//div[@class='item-grid']/div[4]/div/div[2]/div[3]/div[2]/button[2]");
    private By _productComparison = By.xpath("//div//div//p//a[@href=\"/compareproducts\"]");
    private By _removegreenpage=By.xpath("//span[@class=\"close\"]");

    public void compareProducts() {

        clickOnElement(_HTCCompare);
        waitForElementToBeVisible(_productComparison,10);
        clickOnElement(_removegreenpage);
        //waitForElementToBeClickable(_virtualgiftCard,10);
        clickOnElement(_virtualgiftCard);
        waitForElementToBeClickable(_productComparison,15);
        clickOnElement(_productComparison);
    }

    //referred applemac book pro to a friend
    private By _addToCart = By.xpath("//div[@class='product-grid home-page-product-grid']/div[contains(@class,'item-grid')]/div[2]/div/div[2]/div[3]/div[2]/button[1]");

    public void addToCart() {
       clickOnElement(_addToCart);
    }


    private By _Electronics = By.xpath("//div[@class='header-menu']//ul[@class='top-menu notmobile']//a[@href='/electronics']");
     public void clickOnElectronics(){
         clickOnElement(_Electronics);

    }

}



