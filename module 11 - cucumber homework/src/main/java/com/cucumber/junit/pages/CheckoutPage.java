package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {
    private static final String emailFieldName = "emailAddress";
    private static final String checkoutSubtotalXpath = "//div[contains(@aria-label, 'Sub-total')]//dd";
    private static final String checkoutTotalXpath = "//div[contains(@aria-label, 'Total')]//dd";
    private static final String checkoutVATXpath = "//div[contains(@aria-label, 'VAT')]//dd";

    public WebElement emailField() {
        return findElement(By.name(emailFieldName));
    }
    public String checkoutSubtotal() {
        return findElement(By.xpath(checkoutSubtotalXpath)).getText();
    }
    public String checkoutTotal() {
        return findElement(By.xpath(checkoutTotalXpath)).getText();
    }
    public String checkoutVAT() {
        return findElement(By.xpath(checkoutVATXpath)).getText();
    }




}
