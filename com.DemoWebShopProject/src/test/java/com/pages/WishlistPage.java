////package com.pages;
////
////import java.time.Duration;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.WebDriverWait;
////
////public class WishlistPage {
////    WebDriver driver;
////
////    public WishlistPage(WebDriver driver) {
////        this.driver = driver;
////    }
////
////    By digitalDownloadsLink = By.linkText("Digital downloads");
////    By thirdAlbumWishlistButton = By.xpath("(//div[@class=\"picture\"]//img)[3]");
////   // By addToWishlist=By.xpath("//input[@id=\"add-to-wishlist-button-53\"]");
////    By wishlistLink = By.xpath("(//a[@class=\"ico-wishlist\"])[1]");
////    By logoutLink = By.linkText("Log out");
////
////    public void clickDigitalDownloads() {
////        driver.findElement(digitalDownloadsLink).click();
////    }
////
////    public void addAlbumToWishlist() {
////        driver.findElement(thirdAlbumWishlistButton).click();
////    }
////
////    public void goToWishlist() {
////        driver.findElement(wishlistLink).click();
////    }
////
//////    public boolean isProductInWishlist(String productName) {
//////        return driver.getPageSource().contains(productName);
//////    }
////    
//////    public boolean isProductInWishlist(String productName) {
//////        try {
//////            return driver.findElement(By.xpath("//p[@class=\"content\"]")).isDisplayed();
//////        } catch (Exception e) {
//////            return false;
//////        }
//////    }
////    
////    public boolean isProductInWishlist(String productName) {
////        try {
////            goToWishlist(); // Clicks the wishlist icon/link to open the wishlist page
////
////            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////            By productLocator = By.xpath("//table[@class='cart']//td[@class='product']//a[text()='" + productName + "']");
////            return wait.until(ExpectedConditions.visibilityOfElementLocated(productLocator)).isDisplayed();
////        } catch (Exception e) {
////            return false;
////        }
////    }
////
////      public void logout() {
////        driver.findElement(logoutLink).click();
////    }
////}
//
//
//package com.pages;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class WishlistPage {
//    WebDriver driver;
//
//    public WishlistPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    By digitalDownloadsLink = By.linkText("Digital downloads");
//    By albumLink = By.xpath("//a[text()='3rd Album']");
//    By addToWishlist = By.xpath("//input[@id='add-to-wishlist-button-53']");
//    By wishlistLink = By.xpath("(//a[@class='ico-wishlist'])[1]");
//    By logoutLink = By.linkText("Log out");
//
//    public void clickDigitalDownloads() {
//        driver.findElement(digitalDownloadsLink).click();
//    }
//
//    public void clickAlbum() {
//        driver.findElement(albumLink).click();
//    }
//
//    public void addAlbumToWishlist() {
//        driver.findElement(addToWishlist).click();
//    }
//
//    public void goToWishlist() {
//        driver.findElement(wishlistLink).click();
//    }
//
//    public boolean isProductInWishlist(String productName) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            By productLocator = By.xpath("//table[@class='cart']//td[@class='product']//a[text()='" + productName + "']");
//            return wait.until(ExpectedConditions.visibilityOfElementLocated(productLocator)).isDisplayed();
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//    public void logout() {
//        driver.findElement(logoutLink).click();
//    }
//}
//



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

//    public void logout() {
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-logout']")));
//  
//    	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();

    	
       ////driver.findElement(logoutLink).click();
    }
//}


