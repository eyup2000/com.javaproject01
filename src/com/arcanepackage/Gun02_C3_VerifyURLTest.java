package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C3_VerifyURLTest {
    /*
    Google ana sayfasına git
    Google anasayfasında url'in https://www.google.com oldugunu duğrula
     */
    public static void main(String[] args) {
        //path set et
        System.setProperty("driver.chrome.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

      String expectedUrl = "https://www.google.com/";
    String actualUrl = driver.getCurrentUrl();

    if (expectedUrl.equals(actualUrl)){
        System.out.println("Test başarılı");
    }else {
        System.out.println("Test başarısız");
        System.out.println("Actual :"+ actualUrl);
        System.out.println("Expected :"+expectedUrl);
    }


    }
}
