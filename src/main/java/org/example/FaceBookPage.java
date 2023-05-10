package org.example;

import org.testng.Assert;

import java.util.ArrayList;

public class FaceBookPage extends Utils {
    //method to go next window and comeback to main window
    public void goOnFacebookPage(){
        ArrayList<String>windows=new ArrayList<String>(driver.getWindowHandles());
        //command for switch to next window
        driver.switchTo().window(windows.get(1));
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce","URL for child window");
        //command for close child window
        driver.close();
        //command to go back main window
        driver.switchTo().window(windows.get(0));

    }






   // String expectedFacebookUrl="https://www.facebook.com/nopCommerce";


}
