//package com.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class LoginPage {
//    WebDriver driver;
//
//    By loginLink = By.className("ico-login");
//    By emailField = By.id("Email");
//    By passwordField = By.id("Password");
//    By loginButton = By.cssSelector("input.button-1.login-button");
//    By welcomeMessage = By.cssSelector("div.topic-block-title > h2");
//    By errorMessage = By.cssSelector("div.validation-summary-errors");
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void clickLoginLink() {
//        driver.findElement(loginLink).click();
//    }
//
//    public void enterEmail(String email) {
//        WebElement emailInput = driver.findElement(emailField);
//        emailInput.clear();
//        emailInput.sendKeys(email);
//    }
//
//    public void enterPassword(String password) {
//        WebElement passInput = driver.findElement(passwordField);
//        passInput.clear();
//        passInput.sendKeys(password);
//    }
//
//    public void clickLoginButton() {
//        driver.findElement(loginButton).click();
//    }
//
//    public String getWelcomeMessage() {
//        return driver.findElement(welcomeMessage).getText();
//    }
//
//    public String getErrorMessage() {
//        return driver.findElement(errorMessage).getText();
//    }
//}


package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    By loginLink = By.className("ico-login");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.cssSelector("input.button-1.login-button");
    By errorMessage = By.cssSelector("div.validation-summary-errors");
    By myAccountLink = By.className("ico-account"); 

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailField);
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passInput = driver.findElement(passwordField);
        passInput.clear();
        passInput.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

//    public boolean validateLogin(String expectedMessage) {
//        try {
//            if (expectedMessage.equalsIgnoreCase("Login passed")) {
//                // Check if "My account" link is displayed
//                return driver.findElement(myAccountLink).isDisplayed();
//            } else {
//                // Check if error message is displayed
//                return driver.findElement(errorMessage).isDisplayed();
//            }
//        } catch (Exception e) {
//            return false;
//        }
    
    public boolean validateLogin(String expectedMessage) {
        try {
            if (expectedMessage.equalsIgnoreCase("Login passed")) {
                WebElement logoutLink = driver.findElement(By.className("ico-logout"));
                return logoutLink.isDisplayed();
            } else {
                WebElement errorMsg = driver.findElement(By.cssSelector("div.validation-summary-errors"));
                return errorMsg.isDisplayed();
            }
        } catch (Exception e) {
            return false;
        }
    }

    }


