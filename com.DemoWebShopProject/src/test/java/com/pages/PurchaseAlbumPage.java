package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PurchaseAlbumPage {

    WebDriver driver;

    By digitalDownloadsLink = By.linkText("Digital downloads");
    By addToCartButtons = By.cssSelector("input[value='Add to cart']");
    By shoppingCartLink = By.className("ico-cart");
    By cartItems = By.cssSelector("td.product a");
    By logoutLink = By.className("ico-logout");

    public PurchaseAlbumPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDigitalDownloads() {
        driver.findElement(digitalDownloadsLink).click();
    }

    public void addAlbumToCart(String albumName) {
        List<WebElement> productTitles = driver.findElements(By.cssSelector("h2.product-title > a"));
        List<WebElement> addButtons = driver.findElements(addToCartButtons);

        for (int i = 0; i < productTitles.size(); i++) {
            if (productTitles.get(i).getText().equalsIgnoreCase(albumName)) {
                addButtons.get(i).click();
                break;
            }
        }
    }

    public void clickShoppingCart() {
        driver.findElement(shoppingCartLink).click();
    }

    public boolean isProductInCart(String productName) {
        List<WebElement> items = driver.findElements(cartItems);
        for (WebElement item : items) {
            if (item.getText().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}
