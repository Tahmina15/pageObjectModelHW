package org.example;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    DriverManager driverManager=new DriverManager();

  //Open the Browser
    @BeforeMethod
   public void setup(){
      driverManager.openBrowser();
   }
   @AfterMethod
    public void tearDown(){
        driverManager.closeBrowser();
   }

}
