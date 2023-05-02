package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage = new HomePage();
    //creating object for registration test case
    RegisterPage registerPage = new RegisterPage();
    RegisterResult registerResult = new RegisterResult();
    //creating object for compare products test case
    CompareProducts compareProducts = new CompareProducts();
    //creating object for reffered a product to a friend test case
    AppleMacbookProPage appleMacbookProPage=new AppleMacbookProPage();
    ProductEmailAFriend productEmailAFriend=new ProductEmailAFriend();
    LogInPage logInPage = new LogInPage();
    CameraAndPhotoPage cameraAndPhoto = new CameraAndPhotoPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CartPage cartPage = new CartPage();


    @Test
    public void verifyUserShouldRegisterSuccessfully(){
        //click on registration
        homePage.clickOnRegister();
        //fill all register details
        registerPage.registerDetails();
        //verify that user registered successfully
        registerResult.verifyUserShouldRegisterSuccessfully();
    }
    @Test
    public void verifyUserShouldVoteSuccessfully(){
        //select good option homepage
        homePage.clickOnGoodOption();
        //click on vote homepage
        homePage.clickOnVote();
        //verify result message homepage
        homePage.getTextFromVoteResult();
    }
    @Test
    public void verifyUserShouldCompareTwoProducts(){
        //click compare button to compare two products 'htc & virtual gift card' then click on product comparison on the top .
        homePage.compareProducts();
        //verify compare products then clear it also get the after text
        compareProducts.compareProductDetails();
    }
    @Test
    public void verifyUserCanRefferedAProduct(){
        //click On Add To Cart Button
        homePage.addToCart();
        //click on email a friend
       appleMacbookProPage.emailAFriend();
        //fill all the compulsory field from email a friend,click on send email,get the error message
      productEmailAFriend.emailAFriendDetails();
        productEmailAFriend.errorMessage();


    }
    @Test
    public void toVerifyRegisterUserShouldReffardAProductToAFriend(){
        //click on register button top right corner
        homePage.clickOnRegister();
        //fill all the compulsory field from the registration form
        registerPage.registerDetails();
        //after registration click on continue
        registerPage.continueAfterRegistration();
        //click on add to cart button in Apple Macbook pro
        homePage.addToCart();
        //click on email a friend
        appleMacbookProPage.emailAFriend();
        //give your and your friends details
        productEmailAFriend.emailAFriendDetails();


    }
    @Test
    public void toVerifyRegisterUserShouldVote(){
        //click on register button
        homePage.clickOnRegister();
        //type and fill all the compulsory field from registration form
        registerPage.registerDetails();
        //click on continue button
        registerPage.continueAfterRegistration();
        //select and click good option
        homePage.clickOnGoodOption();
        //click on vote
        homePage.clickOnVote();


    }
    @Test
    public void toVerifyTheShoppingBusketContainsAppropriateIteams(){
        //click on electronics from homepage
    homePage.clickOnElectronics();
    //click on camera and photo
    electronicsPage.clickOnCameraAndPhoto();
    //click on add to cart button in Leica T Mirrorless camera
    cameraAndPhoto.addToCartLeicaTMirrorLessCamera();
    //check that shopping cart contains appropriate iteams
    cartPage.shoppingCartDetails();
    }


}
