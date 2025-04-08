package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishlistPage {
    WebDriver driver;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    By digitalDownloadsLink = By.linkText("Digital downloads");
    By albumLink = By.xpath("//a[text()='3rd Album']");
    By addToWishlist = By.xpath("//input[@id='add-to-wishlist-button-53']");
    By wishlistLink = By.xpath("(//a[@class='ico-wishlist'])[1]");
    By logoutLink = By.xpath("//a[@class=\"ico-logout\"]");
    By friendEmailInput = By.id("FriendEmail");
    By yourEmailInput = By.id("YourEmailAddress");
    By messageBox = By.id("PersonalMessage");
    By sendEmailButton = By.name("send-email");
    By emailAFriendLink = By.xpath("//input[@value='Email a friend']");
    
    public void clickDigitalDownloads() {
        driver.findElement(digitalDownloadsLink).click();
    }

    public void clickAlbum() {
        driver.findElement(albumLink).click();
    }

    public void addAlbumToWishlist() {
        driver.findElement(addToWishlist).click();
    }

    public void goToWishlist() {
        driver.findElement(wishlistLink).click();
    }

    public boolean isProductInWishlist(String productName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            By productLocator = By.xpath("//table[@class='cart']//td[@class='product']//a[text()='" + productName + "']");
            return wait.until(ExpectedConditions.visibilityOfElementLocated(productLocator)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
        
    }
    public void clickEmailAFriend() {
        driver.findElement(emailAFriendLink).click();
    }
    public void enterFriendEmail(String email) {
        driver.findElement(friendEmailInput).sendKeys(email);
    }

    public void enterYourEmail(String email) {
        driver.findElement(yourEmailInput).sendKeys(email);
    }

    public void enterPersonalMessage(String msg) {
        driver.findElement(messageBox).sendKeys(msg);
    }

    public void clickSendEmail() {
        driver.findElement(sendEmailButton).click();
    }
}