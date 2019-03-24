package com.pageObject.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage
{
    WebDriver driver;
    public RediffHomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    By search = By.xpath("//input[@class='homesrchbox']");
    By submit = By.xpath("//input[@class='newsrchbtn']");
    By money = By.xpath("//*[@id='homewrapper']/div[5]/a[3]/div/u");

    public WebElement search()
    {
        return driver.findElement(search);
    }
    public WebElement submit()
    {
        return driver.findElement(submit);
    }
    public WebElement money()
    {
        return driver.findElement(money);
    }
}
