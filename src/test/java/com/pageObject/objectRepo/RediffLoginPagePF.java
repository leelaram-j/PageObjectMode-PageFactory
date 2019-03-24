package com.pageObject.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF
{
    // This class is written using Page Factory Annotation method using @FindBy
    WebDriver driver;
    public RediffLoginPagePF(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@id='login1']")
    WebElement userName;

    @FindBy(xpath="//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement goButton;

    @FindBy(linkText = "Home")
    WebElement home;

    public WebElement EmailId()
    {
        return userName;
    }
    public WebElement Password()
    {
        return password;
    }
    public WebElement Go()
    {
        return goButton;
    }
    public WebElement Home()
    {
        return home;
    }
}
