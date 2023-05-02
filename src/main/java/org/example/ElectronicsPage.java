package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    private By _cameraAndPhoto=By.xpath("//div[@class='sub-category-item']//a[@href='/camera-photo']");

    public void clickOnCameraAndPhoto(){
        clickOnElement(_cameraAndPhoto);

    }

}
