
package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Page.Login_Page;
import Page.Products_Page;

public class Products_tests extends BaseTest {

    @Test
    public void products_sort_add_remove_test() throws InterruptedException {

        Login_Page log = new Login_Page(driver);
        Products_Page prd = new Products_Page(driver);

        // Step 1: Login
        log.username(BaseTest.username);
        log.password(BaseTest.password);
        log.loginButton();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("/inventory.html"),
            "Login failed: Inventory page was not opened"
        );

        // Step 2: Sort products A to Z
        Thread.sleep(3000);
        prd.sort_atoz();

        List<String> actualAscending = prd.getProductNames();
        List<String> expectedAscending =
            new ArrayList<>(actualAscending);

        Collections.sort(
            expectedAscending,
            String.CASE_INSENSITIVE_ORDER
        );
        Assert.assertEquals(
            actualAscending,
            expectedAscending,
            "Products are not sorted from A to Z"
        );

        // Step 3: Sort products Z to A
        Thread.sleep(3000);
        prd.sort_ztoa();

        List<String> actualDescending = prd.getProductNames();
        List<String> expectedDescending =
            new ArrayList<>(actualDescending);

        expectedDescending.sort(
            String.CASE_INSENSITIVE_ORDER.reversed()
        );
        Assert.assertEquals(
            actualDescending,
            expectedDescending,
            "Products are not sorted from Z to A"
        );

        // Step 4: Add backpack to cart
        
        Thread.sleep(3000);
        prd.backpack_cart();

        Assert.assertEquals(
            prd.getCartCount(),
            1,
            "Cart should contain one product after adding backpack"
        );

        Thread.sleep(3000);
        // Step 5: Add bike light to cart
        prd.bikeLight_cart();

        Assert.assertEquals(
            prd.getCartCount(),
            2,
            "Cart should contain two products"
        );

        Thread.sleep(3000);
        // Step 6: Remove bike light
        prd.bikeLight_removeCart();

        Assert.assertEquals(
            prd.getCartCount(),
            1,
            "Cart should contain one product after removal"
        );

        Thread.sleep(3000);
        // Step 7: Remove backpack
        prd.backpack_removeCart();

        Assert.assertFalse(
            prd.isCartBadgeDisplayed(),
            "Cart badge should disappear when all products are removed"
        );

        System.out.println(
            "Product sorting, adding and removing tests passed."
        );
    }
}
