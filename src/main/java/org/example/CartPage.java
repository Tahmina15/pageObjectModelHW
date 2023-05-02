package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends Utils{
    private By _shoppingCart=By.xpath("//div[@class=\"page shopping-cart-page\"]//a[text()='Leica T Mirrorless Digital Camera']");
    String expectedProductName="Leica Tt Mirrorless Digital Camera";
    public void shoppingCartDetails(){
     Assert.assertEquals(getTextFromElement(_shoppingCart),expectedProductName) ;


   }

}
