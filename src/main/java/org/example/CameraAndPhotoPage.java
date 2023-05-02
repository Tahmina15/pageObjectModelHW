package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils {
    private By _leicaTMirrorlessCamera = By.xpath("//div[@class='item-box'][3]//div[@class='product-item']//div[@class='details']//div[@class='add-info']//div[@class='buttons']//button[@class='button-2 product-box-add-to-cart-button']");
    private By _shoppingCart=By.xpath("//div[@id='bar-notification']/div/p/a");
    public void addToCartLeicaTMirrorLessCamera(){
       clickOnElement(_leicaTMirrorlessCamera);
       waitForElementToBeClickable(_shoppingCart,10);
       clickOnElement(_shoppingCart);

    }


}