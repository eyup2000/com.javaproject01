package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C1_FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("driver.chrome.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //get() url gitmek için kullanılır
        driver.get("https://www.amazon.com");


    }
}
