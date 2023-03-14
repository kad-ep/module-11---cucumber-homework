package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private static final String SHOP_URL = "https://www.bookdepository.com/";
    private static final String BOOK_LINK = "//div[@id='Bestselling Books']/following-sibling::*//a[contains(text(), 'Atomic Habits')]";


    public void openShopWebsite() {
        DriverManager.driver.get(SHOP_URL);
    }

    public WebElement bookElement(){
        return waitForElementLocatedBy(DriverManager.driver, By.xpath(BOOK_LINK));
    }




}
