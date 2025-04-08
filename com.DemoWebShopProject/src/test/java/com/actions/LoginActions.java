
package com.actions;

import com.pages.LoginPage;
import com.utils.HelperClass;

public class LoginActions {

    LoginPage loginPage;

    public LoginActions() {
        this.loginPage = new LoginPage(HelperClass.getDriver());
    }

    public void clickLoginLink() {
        loginPage.clickLoginLink();
    }

    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }

    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }

    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    public void performLogin(String email, String password) {
        clickLoginLink();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public boolean isLoginSuccessful(String expectedStatus) {
        return loginPage.validateLogin(expectedStatus);
    }
}
