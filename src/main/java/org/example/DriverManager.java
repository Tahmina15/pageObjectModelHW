package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils {
    //method for open the browser
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    //method for close the driver
    public void closeBrowser(){
        driver.close();
    }
}
