package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersaucNew1 {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String link)
    {
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
        }

        driver.get(link);
        driver.manage().window().maximize();
    }
    @Test
    public void googleTest() throws InterruptedException {

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.name("login-button")).click();
//        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);

//driver.findElement(By.linkText("")).click();
//        driver.findElement(By.partialLinkText("Baackpack")).click();
//        Thread.sleep(1000);
String a= driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println(a);
        Thread.sleep(2000);





    }

//    @AfterClass
//    void close(){
//
//        driver.close();
//    }



}
