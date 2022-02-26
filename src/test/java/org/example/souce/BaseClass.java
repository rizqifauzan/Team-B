package org.example.souce;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseClass {

    WebDriver driver;
    Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
