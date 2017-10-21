package com.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/* This is base page class which opens the page. */

public class PageBase {
    protected String URL;
    protected WebDriver driver;
    protected String pageTitle;

    public static final int DEFAULT_WAIT_4_PAGE = 12;

    public PageBase(WebDriver myDriver, String pageTitle) {
        this.driver = myDriver;
        this.pageTitle = pageTitle;
    }

    public void open() {
        driver.get(URL);
    }


    public void waitForPageToLoad() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_4_PAGE, TimeUnit.SECONDS);
    }

}
