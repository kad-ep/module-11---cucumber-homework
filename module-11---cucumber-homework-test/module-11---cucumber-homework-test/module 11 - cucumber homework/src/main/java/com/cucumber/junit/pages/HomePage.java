package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    private static final String SHOP_URL = "https://www.bookdepository.com/";
    private static final String BOOK_LINK = "//div[@id='Bestselling Books']/following-sibling::*//a[contains(text(), 'Atomic Habits')]";
    private static final String ACCEPT_COOKIES_BUTTON =  "button.btn-yes";

    public void openShopWebsite() {
        DriverManager.driver.get(SHOP_URL);
    }


    @FindBy(xpath = BOOK_LINK)
    public WebElement bookElement;

//    @FindBy(css = ACCEPT_COOKIES_BUTTON)
//    public WebElement acceptCookiesButton;

//    public void acceptCookies() {
//        if (acceptCookiesButton != null ){
//            acceptCookiesButton.click();
//            System.out.println("case not null. acceptCookiesButton: " + acceptCookiesButton);
//        }
//        System.out.println("case null. acceptCookiesButton: " + acceptCookiesButton);
//    }
//    public WebElement bookElement(){
//        return waitForElementLocatedBy(DriverManager.driver, By.xpath(BOOK_LINK));
//    }




}
