package org.example.souce;

import org.example.pageObject.InventoryPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseClass{

    public LoginTest(){
    }

    public LoginTest(WebDriver webDriver){
        this.driver = webDriver;
    }

    @Test
    public void negativeCase1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("admin");
        loginPage.setPassword("password");
        loginPage.clickLogin();
        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Username and password do not match any user in this service"));
    }

    @Test
    public void negativeCase2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("admin");
        loginPage.setPassword("");
        loginPage.clickLogin();
        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Password is required"));
    }

    @Test
    public void negativeCase3() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("");
        loginPage.setPassword("password");
        loginPage.clickLogin();
        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Username is required"));
    }

    @Test
    public void positiveCase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertTrue(inventoryPage.isPageDisplayed());
    }

}
