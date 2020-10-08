package com.QA25Site101Rose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CSS10For101Rose {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://101-rosa.ru/");
    }
    @Test
    public void searchFromCatalogTest(){
        //click on Catalog
        wd.findElement(By.cssSelector("#lnk-2")).click();
        //wd.findElement(By.cssSelector("#products")).click();
        //wd.findElement(By.cssSelector("lnk-5")).click();
        wd.findElement(By.cssSelector("#footertext2")).click();
        wd.findElement(By.cssSelector("#lnk-4")).click();
        wd.findElement(By.cssSelector("#lnk-3")).click();
        //wd.findElement(By.cssSelector("#vk_api_transport")).click();





    }
    @AfterMethod (enabled = false)
    public void tearDown(){
        wd.quit();
    }

}
