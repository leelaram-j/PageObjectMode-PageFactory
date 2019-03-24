package com.pageObject.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF
{
    WebDriver driver;
    public RediffHomePagePF(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@class='homesrchbox']")
    WebElement search;

    @FindBy(xpath = "//input[@class='newsrchbtn']")
    WebElement submit;

    @FindBy(xpath="//*[@id='homewrapper']/div[5]/a[3]/div/u")
    WebElement money;

    public WebElement search()
    {
        return search;
    }
    public WebElement submit()
    {
        return submit;
    }
    public WebElement money()
    {
        return money;
    }
}
