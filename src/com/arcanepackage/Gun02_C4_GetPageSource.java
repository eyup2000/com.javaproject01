package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C4_GetPageSource {
    public static void main(String[] args) {
        //Path set et
        System.setProperty("driver.chrome.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/chromedriver.exe");
        //chrome driver object oluştur
        WebDriver driver =new ChromeDriver();
        // sayfayı buyut maximize et
        driver.manage().window().maximize();
        //google ana sayfaya git
        driver.get("https://www.google.com");
        //Amazon sayfasına git
        driver.navigate().to("https:/www.amazon.com");

        //getPageSource() string olarak dondürür.
        //Tüm sayfanın içinde istediggini bir text metin kullanıp kullanılmadıgını verify edebiliriz
        //note: page source icin assertion pek sik kullanılmaz cunku burda çok bilgi vardır ve yanlış 0olabir

       String pageSource = driver.getPageSource();
       // System.out.println(pageSource);

       // System.out.println(pageSource.contains("Electronics"));

        if (pageSource.contains("Gaming accessories")){
            System.out.println("Başarili");
        }else {
            System.out.println("basarisiz");
        }
        driver.close();
    }
}
