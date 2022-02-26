package org.example.souce;

import org.example.pageObject.InventoryPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class InventoryTest extends BaseClass{


    @Test
    public void verifyDropdown(){
        LoginTest loginTest = new LoginTest(this.driver);
        loginTest.positiveCase();

        InventoryPage inventoryPage = new InventoryPage(this.driver);
        inventoryPage.selectDropdownProductByLabel("Price (high to low)");

        // TODO Verify
    }
}
