package com.cucumber.junit.steps;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

public class OrderSteps {

    private HomePage homePage = new HomePage();
    private PDP pdp = new PDP();
    private BasketPage basketPage = new BasketPage();
    private CheckoutPage checkoutPage = new CheckoutPage();

    @Given("The homepage is open")
    public void openSite() {
        homePage.openShopWebsite();
    }

    @When("open product details page for Atomic Habits book")
    public void openPDP() {
        homePage.bookElement().click();
    }

    @And("Add to cart for product Atomic Habits is clicked on product details page")
    public void addToCart() {
        pdp.addToBasketButton().click();
    }

    @And("Order Subtotal and Order Total are {string}")
    public void checkPopupPrices(String price) {
        Assert.assertTrue("Order Subtotal and Order Total are not equal!", pdp.getBookPrice().equals(price) && pdp.getTotalPrice().equals(price));
    }

    @And("Select BasketCheckout in cart pop-up")
    public void openBasketPage() {
        pdp.basketCheckoutButton().click();
    }

    @And("Click Checkout button after redirect to cart page")
    public void goToCheckout() {
        basketPage.checkoutButton().click();
    }

    @And("Set {string} as e-mail address")
    public void emailEnter(String email) {
        checkoutPage.emailField().sendKeys(email);
    }

    @Then("Subtotal and Total are {string} and Tax is {string}")
    public void checkCheckoutPrices(String total, String tax ) {
        Assert.assertTrue("Checkout subtotal is incorrect!", checkoutPage.checkoutSubtotal().equals(total));
        Assert.assertTrue("Checkout total is incorrect!", checkoutPage.checkoutTotal().equals(total));
        Assert.assertTrue("Checkout VAT is incorrect!", checkoutPage.checkoutVAT().equals(tax));
        DriverManager.quitDriver();
    }
}
