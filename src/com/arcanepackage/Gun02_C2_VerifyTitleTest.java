package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gun02_C2_VerifyTitleTest {
    public static void main(String[] args) {
        //Path'i set et
        System.setProperty("webdriver.gecko.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/geckodriver.exe");

        // obje olustur
        WebDriver driver = new FirefoxDriver();

        //Maximize the window
        driver.manage().window().maximize();

       // google bağlantısını aç
        driver.get("https://www.google.com/");

        // google bağlantısını google oldugunu dogurula
        String expectedTitle ="Google";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Başarili");
        }else {
            System.out.println("test Başarisiz");
        }
        driver.close();
        /*
        eger yazdıgımız scripler başarısız olursa
        1) scripleri tekrar tektar kosturuyoruz
        2) Manuel test yapıyoruz
        3) usiness Analist(BA) urunun sahibi belirler
        bir tester olarak sizin göreviniz dökümanlarda bulunan yaznlışları bulmak degildir
        Sizin misyonunuz bug ve kusur bulacak script (kod) yazmak.
         */
    }
}
