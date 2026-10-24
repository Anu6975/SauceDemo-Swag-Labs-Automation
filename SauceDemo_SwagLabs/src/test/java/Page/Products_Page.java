
package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Products_Page {

    WebDriver driver;
    static Select sort;

    public Products_Page(WebDriver driver) {
        this.driver = driver;
    }

    By backPack_product = By.id("item_4_title_link");
    By tshirt_product = By.id("item_1_title_link");
    By cart_button = By.id("add-to-cart");

    By sort_Products = By.className("product_sort_container");

    By bikeLights_cartButton =
            By.id("add-to-cart-sauce-labs-bike-light");

    By bikeLights_remove =
            By.id("remove-sauce-labs-bike-light");

    By redTshirt_cartButton =
            By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    By backPack_cartButton =
            By.id("add-to-cart-sauce-labs-backpack");

    By backPack_remove =
            By.id("remove-sauce-labs-backpack");

    By cartBadge = By.className("shopping_cart_badge");

    By productNames = By.className("inventory_item_name");


    // Open product details
    public void backPack_click() {
        driver.findElement(backPack_product).click();
    }

    public void tshirt_click() {
        driver.findElement(tshirt_product).click();
    }

    // Add the product on the currently displayed product page
    public void add_to_cart() {
        driver.findElement(cart_button).click();
    }

    // Sort products A to Z
    public void sort_atoz() {
        sort = new Select(driver.findElement(sort_Products));
        sort.selectByVisibleText("Name (A to Z)");
    }

    // Sort products Z to A
    public void sort_ztoa() {
        sort = new Select(driver.findElement(sort_Products));
        sort.selectByVisibleText("Name (Z to A)");
    }

    // Add products from the inventory page
    public void bikeLight_cart() {
        driver.findElement(bikeLights_cartButton).click();
    }

    public void redTshirt_cart() {
        driver.findElement(redTshirt_cartButton).click();
    }

    public void backpack_cart() {
        driver.findElement(backPack_cartButton).click();
    }

    // Remove products from the inventory page
    public void bikeLight_removeCart() {
        driver.findElement(bikeLights_remove).click();
    }

    public void backpack_removeCart() {
        driver.findElement(backPack_remove).click();
    }

    // Return the number displayed on the cart badge
    public int getCartCount() {
        return Integer.parseInt(
                driver.findElement(cartBadge).getText()
        );
    }

    // Return product names in their displayed order
    public List<String> getProductNames() {
        List<String> names = new ArrayList<>();

        List<WebElement> products =
                driver.findElements(productNames);

        for (WebElement product : products) {
            names.add(product.getText());
        }

        return names;
    }

    // Check whether the cart badge is displayed
    public boolean isCartBadgeDisplayed() {
        return !driver.findElements(cartBadge).isEmpty();
    }
}
