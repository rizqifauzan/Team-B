package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PenjumlahanTest {

    @Test
    public void penjumlahanTest() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");

        driver.findElement(By.xpath("//button[.='2']")).click();
        driver.findElement(By.xpath("//button[.='0']")).click();
        driver.findElement(By.xpath("//button[.='0']")).click();
        driver.findElement(By.xpath("//button[.='+']")).click();
        driver.findElement(By.xpath("//button[.='5']")).click();
        driver.findElement(By.xpath("//button[.='0']")).click();
        driver.findElement(By.xpath("//button[@id='resultButton']")).click();

        String output = driver.findElement(By.xpath("//div[@id='output']")).getText();

        Assert.assertEquals("250", output);

        driver.quit();

    }
}
