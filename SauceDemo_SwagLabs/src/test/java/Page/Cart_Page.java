
package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart_Page {

    WebDriver driver;

    public Cart_Page(WebDriver driver) {
        this.driver = driver;
    }

    By cartLink = By.className("shopping_cart_link");
    By checkoutButton = By.id("checkout");

    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");

    By continueButton = By.id("continue");
    By finishButton = By.id("finish");

    By confirmationMessage =
            By.className("complete-header");

    public void openCart() {
        driver.findElement(cartLink).click();
    }

    public void checkout() {
        driver.findElement(checkoutButton).click();
    }

    public void enterCustomerDetails(
            String first,
            String last,
            String postal) {

        driver.findElement(firstName).sendKeys(first);
        driver.findElement(lastName).sendKeys(last);
        driver.findElement(postalCode).sendKeys(postal);
    }

    public void continueCheckout() {
        driver.findElement(continueButton).click();
    }

    public void finishOrder() {
        driver.findElement(finishButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}
