package com.pageObject.tuto;

import com.pageObject.objectRepo.RediffHomePage;
import com.pageObject.objectRepo.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest
{
    @Test
    public void loginTest()
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPage rd = new RediffLoginPage(driver);
        rd.EmailId().sendKeys("testuser");
        rd.Password().sendKeys("testuser");
        rd.Go().click();
        rd.Home().click();
        RediffHomePage rh = new RediffHomePage(driver);
        rh.money().click();
    }

}