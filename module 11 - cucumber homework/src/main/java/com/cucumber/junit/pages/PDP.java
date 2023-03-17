package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PDP extends BasePage{
    private static final String bookPriceCSSLocator = "div.price-info-wrap span.sale-price";
    private static final String addToBasketButtonCSSLocator = "div.checkout-tools a.btn.btn-primary.add-to-basket";
    private static final String pdpTotalPriceCss = "span#basket-total-cost>b.pink-text.big.total";
    private static final String basketCheckoutButtonLinkText = "Basket / Checkout";
    @FindBy(css = bookPriceCSSLocator)
    public WebElement bookEl;

    public String getBookPrice(){
        return bookEl.getText();
    }

    @FindBy(css = addToBasketButtonCSSLocator)
    public WebElement addToBasketButton;
    @FindBy(css = pdpTotalPriceCss)
    public WebElement totalPrice;

    @FindBy(linkText = basketCheckoutButtonLinkText)
    public WebElement basketCheckoutButton;

    public String getTotalPrice() {
        return waitForText(DriverManager.driver, By.cssSelector(pdpTotalPriceCss)).getText();
    }






}

