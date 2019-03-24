package com.pageObject.tuto;

import com.pageObject.objectRepo.RediffHomePage;
import com.pageObject.objectRepo.RediffHomePagePF;
import com.pageObject.objectRepo.RediffLoginPage;
import com.pageObject.objectRepo.RediffLoginPagePF;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestPF
{
    @Test
    public void loginTest()
    {
        System.setProperty("webdriver.chrome.driver","//Users//lee//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        RediffLoginPagePF rd = new RediffLoginPagePF(driver);
        rd.EmailId().sendKeys("testuser");
        rd.Password().sendKeys("testuser");
        rd.Go().click();
        rd.Home().click();
        RediffHomePagePF rh = new RediffHomePagePF(driver);
        rh.money().click();
    }

}