package com.cucumber.junit.steps;

import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.pages.BasketPage;
import com.cucumber.junit.pages.CheckoutPage;
import com.cucumber.junit.pages.HomePage;
import com.cucumber.junit.pages.PDP;
import io.cucumber.java8.En;
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

        When("^open product details page for Atomic Habits book$", () -> { homePage.bookElement.click();});

        And("^Add to cart for product Atomic Habits is clicked on product details page$", () -> {
            pdp.addToBasketButton.click();});

        And("^Order Subtotal and Order Total are \"([^\"]*)\"$", (String price) -> {
            Assert.assertTrue("Order Subtotal and Order Total are not equal!", pdp.getBookPrice().equals(price) && pdp.getTotalPrice().equals(price));
        });
        And("^Select BasketCheckout in cart pop-up$", () -> {pdp.basketCheckoutButton.click();
        });
        And("^Click Checkout button after redirect to cart page$", () -> {basketPage.checkoutButton.click();
        });
        And("^Set \"([^\"]*)\" as e-mail address$", (String email) -> {checkoutPage.emailField.sendKeys(email);
        });
        Then("^Subtotal and Total are \"([^\"]*)\" and Tax is \"([^\"]*)\"$", (String total, String tax) -> {
            Assert.assertTrue("Checkout subtotal is incorrect!", checkoutPage.getCheckoutSubtotal().equals(total));
            Assert.assertTrue("Checkout total is incorrect!", checkoutPage.getCheckoutTotal().equals(total));
            Assert.assertTrue("Checkout VAT is incorrect!", checkoutPage.getCheckoutVAT().equals(tax));
            DriverManager.quitDriver();
        });
    }
}
