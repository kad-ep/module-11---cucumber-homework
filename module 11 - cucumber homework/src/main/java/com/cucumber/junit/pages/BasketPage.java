package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    private static final String checkoutButtonLinkText = "Checkout";

    public WebElement checkoutButton() {
        return findElement(By.linkText(checkoutButtonLinkText));
    }
}
