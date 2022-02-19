package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class PembagianTest {


    @Test
    public void perkalianTest(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");

        driver.findElement(By.xpath("//button[.='4']")).click();
        driver.findElement(By.xpath("//button[.='0']")).click();
        driver.findElement(By.xpath("//button[.='/']")).click();
        driver.findElement(By.xpath("//button[.='1']")).click();
        driver.findElement(By.xpath("//button[.='0']")).click();

        driver.findElement(By.xpath("//button[@class='btn-equal btn btn-info']")).click();

        String output =  driver.findElement(By.xpath("//div[@id='output']")).getText();
        Assert.assertEquals(4, output);






    }


}
