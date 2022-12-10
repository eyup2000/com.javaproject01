package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gun02_C1_FirefoxBrowserDemo {

    /*
    https://www.mozilla.org/en-US/firefox/new/
    https://github.com/mozilla/geckodriver/releases
    Yeni sinif olustur : FirefoxBrowserDemo
    Main method olustur
    Set Path
    Gecko driver olustur
    Ac : google home page https://www.google.com/
    Maximize the window
    Close/Quit the browser
     */
   /* public static void main(String[] args) {
        //path set et
        System.setProperty("webdriver.gecko.driver","C:/Users/user/Documents/Selenium Dependencies/drivers/geckodriver.exe");

    //obje oluştur
        WebDriver driver = new FirefoxDriver();

     //Ac : google home page https://www.google.com/
        driver.get("https://www.google.com/");

        //Maximize the window
    driver.manage().window().maximize();

    //close
        driver.close();




    }
}*/


    public static void main(String[] args) {
        //Path'i set et
        System.setProperty("webdriver.gecko.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/geckodriver.exe");

        // obje olustur
        WebDriver driver = new FirefoxDriver();

        //Maximize the window
        driver.manage().window().maximize();

       //Ac : google home page https://www.google.com/
        driver.get("https://www.google.com/");

        //Close/Quit the browser
        driver.close();


    }
}
