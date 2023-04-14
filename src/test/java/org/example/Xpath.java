package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//xpath is a lang for finding any element in webpage using xml path expression.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
@Test
public class Xpath {
    public void googleTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();



//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/input")).click();


//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id='user-name' or @name='user-name']")).sendKeys("standard_user");
//        Thread.sleep(1000);

//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).sendKeys("standard_user");
//        Thread.sleep(1000);

//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']")).sendKeys("standard_user");



        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");

        driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        Thread.sleep(1000);
//
        driver.findElement(By.xpath("//div[@class='inventory_item']//div[@class='inventory_item_img']//a[@id='item_4_img_link']//img[@class='inventory_item_img']")).click();

  }
}
//option of xpath
//or;and;text();coulamns();start-with;