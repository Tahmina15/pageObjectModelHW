package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

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
       waitForInvisibleElement(_voteResult,10);
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
   private By _productTitles=By.xpath("//h2[@class=\"product-title\"]/a");
   public void printOutProductTitled(){
       //method for printOut multiple products from same aile
       List<WebElement>productList=driver.findElements(_productTitles);
       for (WebElement e:productList) {
           System.out.println(e.getText());}
       }
       private By _searchButton=By.xpath("//button[@class='button-1 search-box-button']");
       public void searchAlert(){
           //while searching something without mention an alert should appear
           clickOnElement(_searchButton);
           Alert alert = driver.switchTo().alert();
           Assert.assertEquals(alert.getText(),"Please enter some search keyword");
           alert.accept();
       }
       private By _currency=By.id("customerCurrency");
       public void currencyInDollar(){
           //When selecting Dollar all products should contain dollar($) symbol
         selectFromDropdownVisibleText(_currency,"US Dollar");
           List<WebElement> productPrice=driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
           System.out.println("Currency in Dollar ");
           for (WebElement element:productPrice) {
               System.out.println(element.getText());
        Assert.assertTrue(element.getText().contains("$"));

           }}
    public void currencyInEuro(){
           //When selecting euro all products should contain euro symbol
     selectFromDropdownVisibleText(_currency,"Euro");

    List<WebElement> productPriceInEuro=driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        System.out.println("Currency in Euro ");
         for (WebElement element:productPriceInEuro) {
             System.out.println(element.getText());
             Assert.assertTrue(element.getText().contains("€"));
       }}


       private By _searchBox=By.id("small-searchterms");
       private  By _items=By.xpath("//h2[@class='product-title']");
       public void searchItems(){
           //verify when search a product appropriate items should appear

         typeTextFromElement(_searchBox,"Nike");
           clickOnElement(_searchButton);
           List<WebElement>items=driver.findElements(_items);
           for (WebElement p:items)
           {System.out.println(p.getText());

           }}

          private By _nopCommerceDetails=By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]");

          public void nopCommerceNewReleaseDetails(){
              //click on nopcommerce new release
              clickOnElement(_nopCommerceDetails);

          }

         public void voteAlert(){
              //verify alert should come when click on vote without selecting answer
              clickOnElement(_vote);
             Alert alert = driver.switchTo().alert();
             Assert.assertEquals(alert.getText(),"Please ssselect an answer");
             alert.accept();
         }
         private By _addToCartComputer=By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[1]//button[1]");
         public void buildYourOwnComputer(){

             clickOnElement(_addToCartComputer);
         }

         private By _facebookButton=By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]");
    public void facebook(){
        //click on facebook
        clickOnElement(_facebookButton);

    }
    private By _welcome=By.xpath("//div[@class=\"topic-block\"]/div/h2");
    public void cameBackMainWindow(){
        //printing the welcome message from main window
        clickOnElement(_welcome);
        Assert.assertEquals(getTextFromElement(_welcome),"Welcome to our store");
    }








}




