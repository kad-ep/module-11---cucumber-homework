@smoke

Feature: As a user I want to get ability to purchase product
Scenario: The prices should be correct
Given The homepage is open
When open product details page for Atomic Habits book
And Add to cart for product Atomic Habits is clicked on product details page
And  Order Subtotal and Order Total are "21,17 €"
And Select BasketCheckout in cart pop-up
And Click Checkout button after redirect to cart page
And Set "test@user.com" as e-mail address
Then Subtotal and Total are "21,17 €" and Tax is "0,00 €"
