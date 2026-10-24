
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.Login_Page;
import Page.Products_Page;
import Page.Cart_Page;

public class PlaceOrder_test extends BaseTest {

    @Test
    public void placeOrderSuccessfully() {

        Login_Page login = new Login_Page(driver);
        Products_Page products = new Products_Page(driver);
        Cart_Page cart = new Cart_Page(driver);

        // Step 1: Login
        login.username(BaseTest.username);
        login.password(BaseTest.password);
        login.loginButton();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/inventory.html"),
            "Login was unsuccessful"
        );

        // Step 2: Add backpack to cart
        products.backpack_cart();

        Assert.assertEquals(
            products.getCartCount(),
            1,
            "Backpack was not added to the cart"
        );

        // Step 3: Open cart
        cart.openCart();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/cart.html"),
            "Cart page was not opened"
        );

        // Step 4: Start checkout
        cart.checkout();

        // Step 5: Enter customer details
        cart.enterCustomerDetails(
            "Anuja",
            "Badve",
            "411014"
        );

        cart.continueCheckout();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/checkout-step-two.html"),
            "Checkout overview page was not opened"
        );

        // Step 6: Finish order
        cart.finishOrder();

        // Step 7: Verify order confirmation
        Assert.assertEquals(
            cart.getConfirmationMessage(),
            "Thank you for your order!",
            "Order confirmation message did not match"
        );

        System.out.println("Order placed successfully!");
    }
}
