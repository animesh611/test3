package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class SaucDemo {
    public void googleTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        Thread.sleep(1000);
        driver.findElement(By.name("login-button")).click();
        //        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);

//driver.findElement(By.linkText("")).click();
//        driver.findElement(By.partialLinkText("Sauce")).click();
//        Thread.sleep(1000);
//        String a= driver.findElement(By.className("inventory_item_price")).getText();
//        System.out.println(a);
//        Thread.sleep(2000);

       List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        Thread.sleep(2000);


    }



}
