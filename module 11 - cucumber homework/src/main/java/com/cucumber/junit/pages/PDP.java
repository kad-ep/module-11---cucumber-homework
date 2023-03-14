package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PDP extends BasePage{
    private static final String bookPriceCSSLocator = "div.price-info-wrap span.sale-price";
    private static final String addToBasketButtonCSSLocator = "div.checkout-tools a.btn.btn-primary.add-to-basket";

    private static final String pdpTotalPriceCss = "span#basket-total-cost>b.pink-text.big.total";
    private static final String basketCheckoutButtonLinkText = "Basket / Checkout";




    public String getBookPrice(){
        return waitForElementLocatedBy(DriverManager.driver, By.cssSelector(bookPriceCSSLocator)).getText();
    }

    public WebElement addToBasketButton(){
        return waitForElementLocatedBy(DriverManager.driver, By.cssSelector(addToBasketButtonCSSLocator));
    }

    public String getTotalPrice() {
        //return waitForElementLocatedBy(DriverManager.driver, By.cssSelector(pdpTotalPriceCss)).getText();
        return waitForText(DriverManager.driver, By.cssSelector(pdpTotalPriceCss)).getText();


    }

    public WebElement basketCheckoutButton() {
        return waitForElementLocatedBy(DriverManager.driver, By.linkText(basketCheckoutButtonLinkText));
    }





}

