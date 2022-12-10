package com.arcanepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gun02_C5_Tekrar {
    /*
Create a new class : Tekrar
ChromeDriver kullanarak, youtube git ve page basliginin  “youtube” oldugunu verify et, eger degilse dogrusunu yazdir.
the page URL'in youtube  icerip icermedigini verify et, ve dogru url'i yazdir.
Sonra https://www.amazon.com/ git
youtube geri navigate et
page'i Refresh et
amazon'a tekrar navigate et
Maximize the window
page basliginin “Amazon” icerdigini dogrula, eger degilse dogru basligi yazdir
page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
Quit the browser
 */

    public static void main(String[] args) {
        System.setProperty("driver.chrome.driver", "C:/Users/user/Documents/Selenium Dependencies/drivers/chromedriver.exe");
        //chrome driver object oluştur
        WebDriver driver =new ChromeDriver();
        //ChromeDriver kullanarak, youtube git ve page basliginin  “youtube” oldugunu verify et, eger degilse dogrusunu yazdir.
        driver.get("https://www.youtube.com/");
        String expectedTitle ="youtube";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test Başarili");
        }else {
            System.out.println("Test Başarisiz");
            System.out.println("Expected başlık : " + expectedTitle);
            System.out.println("actual başlık : " + actualTitle);
        }

        String pageSource = driver.getPageSource();
        if (pageSource.contains("Home")){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        //Sonra https://www.amazon.com/ git
        driver.get("https:/www.amazon.com");

        //youtube geri navigate et
        driver.navigate().back();

        //page'i Refresh et
        driver.navigate().refresh();

        //amazon'a tekrar navigate et
        driver.navigate().forward();

        //Maximize the window
        driver.manage().window().maximize();

        //page basliginin “Amazon” icerdigini dogrula, eger degilse dogru basligi yazdir
        String expectedBaslik = "Amazon";
        String actualBaslik = driver.getTitle();

        if (expectedBaslik.contains(actualBaslik)){
            System.out.println("Test başarili");

        }else {
            System.out.println("Test başarizis");
            System.out.println("ecpected başlık : "+expectedBaslik);
            System.out.println("actual başlık : " + actualBaslik);
        }

        //page URL'in  https://www.amazon.com/ oldugunu dogrula, degilse dogru url'i yazdir
        String expectedUrl ="https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("test başarili");
        }else {
            System.out.println("Test başarizis");
            System.out.println("ecpected url : "+expectedUrl);
            System.out.println("actual url : " + actualUrl);
        }

        //Quit the browser
        driver.quit();
    }
}
