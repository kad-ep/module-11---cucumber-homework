package com.cucumber.junit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    private static final String emailFieldName = "emailAddress";
    private static final String checkoutSubtotalXpath = "//div[contains(@aria-label, 'Sub-total')]//dd";
    private static final String checkoutTotalXpath = "//div[contains(@aria-label, 'Total')]//dd";
    private static final String checkoutVATXpath = "//div[contains(@aria-label, 'VAT')]//dd";
    @FindBy(name = emailFieldName)
    public WebElement emailField;

    @FindBy(xpath = checkoutSubtotalXpath)
    public WebElement checkoutSubtotalEl;

    public String getCheckoutSubtotal() {
        return checkoutSubtotalEl.getText();
    }
    @FindBy(xpath = checkoutTotalXpath)
    public WebElement CheckoutTotalEl;

    public String getCheckoutTotal() {
        return CheckoutTotalEl.getText();
    }

    @FindBy(xpath = checkoutVATXpath)
    public WebElement CheckoutVatEl;
    public String getCheckoutVAT() {
        return CheckoutVatEl.getText();
    }




}
