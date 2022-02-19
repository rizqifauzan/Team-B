package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerkalianTest {

    @Test
    public void perkalianTest1(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");

        driver.findElement(By.xpath("//button[.='9']")).click();
        driver.findElement(By.xpath("//button[.='x']")).click();
        driver.findElement(By.xpath("//button[.='7']")).click();
        driver.findElement(By.xpath("//button[@id='resultButton']")).click();

        String output = driver.findElement(By.xpath("//div[@id='output']")).getText();

        Assert.assertEquals("63", output);
        driver.quit();
    }


}
