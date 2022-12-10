package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun01_C2_BasicNavigations {

//main methodo oluştur
    public static void main(String[] args) throws InterruptedException {

//path set et
        System.setProperty("driver.chrome.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/chromedriver.exe" );

//Chrome Driver oluştur
        WebDriver driver = new ChromeDriver();

//window'u Maxsimize et
        driver.manage().window().maximize();

//Google ana sayfasına git "https://www.google.com"
        driver.get("https://www.google.com");
        Thread.sleep(5000);

//Aynı class içinde amazon sayfasına git ( navigete )
       // driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");//daha hızlı
        Thread.sleep(5000);
//Googleye tekrar geri gel  navigate et
        driver.navigate().back();

//Amazona tekrar /ger, navigate et
        driver.navigate().forward();

//Sayfayı refreh at(Yenile) et
        driver.navigate().refresh();

//Browser'dan close/quit yap ( sayıfayı kapat )
        driver.quit();

    }
}
