package com.cucumber.junit.steps;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.nl.En;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;



public class MyStepdefs implements En {
    private HomePage homePage = new HomePage();
    private PDP pdp = new PDP();
    private BasketPage basketPage = new BasketPage();
    private CheckoutPage checkoutPage = new CheckoutPage();
    public MyStepdefs() {
        Given("The homepage is open", () -> {
            homePage.openShopWebsite();
        });

        When("^open product details page for Atomic Habits book$", () -> { homePage.bookElement.click()});

        And("^Add to cart for product Atomic Habits is clicked on product details page$", () -> {
            pdp.addToBasketButton.click()});

        And("^Order Subtotal and Order Total are \"([^\"]*)\"$", (String price) -> {
            Assert.assertTrue("Order Subtotal and Order Total are not equal!", pdp.getBookPrice().equals(price) && pdp.getTotalPrice().equals(price));
        });
        And("^Select BasketCheckout in cart pop-up$", () -> {
        });
        And("^Click Checkout button after redirect to cart page$", () -> {
        });
        And("^Set \"([^\"]*)\" as e-mail address$", (String arg0) -> {
        });
        Then("^Subtotal and Total are \"([^\"]*)\" and Tax is \"([^\"]*)\"$", (String arg0, String arg1) -> {
        });
    }


}
