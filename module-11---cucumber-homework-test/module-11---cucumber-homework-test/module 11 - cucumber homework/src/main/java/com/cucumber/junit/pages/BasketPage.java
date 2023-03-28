package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {
    private static final String checkoutButtonLinkText = "Checkout";
    @FindBy(linkText = checkoutButtonLinkText )
    public WebElement checkoutButton;
}
