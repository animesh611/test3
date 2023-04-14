package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class newProject2 {
    public void googleTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#pass")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button._42ft")).click();
//        Thread.sleep(2000);

//        driver.findElement(By.cssSelector("[name=email]")).sendKeys("hiiiiii@gmail.com");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("hiiiiii@gmail.com");
//        Thread.sleep(2000);
    }


}
