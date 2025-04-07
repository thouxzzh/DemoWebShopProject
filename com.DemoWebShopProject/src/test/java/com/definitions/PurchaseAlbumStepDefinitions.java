package com.definitions;

import com.actions.LoginActions;
import com.actions.PurchaseAlbumActions;
import com.utils.HelperClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

public class PurchaseAlbumStepDefinitions {

    LoginActions loginActions = new LoginActions();
    PurchaseAlbumActions purchaseAlbumActions = new PurchaseAlbumActions();

    @Given("User launches the browser and navigates to Demo Web Shop")
    public void user_launches_browser_and_navigates_to_demo_web_shop() {
        HelperClass.openPage();
    }

    @When("User logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        loginActions.performLogin(email, password);
    }

    @When("User navigates to Digital Downloads and purchases {string}")
    public void user_navigates_to_digital_downloads_and_purchases(String productName) {
        purchaseAlbumActions.purchaseAlbum(productName);
    }

    @Then("The product {string} should be present in the cart")
    public void the_product_should_be_present_in_the_cart(String productName) {
        boolean isPresent = purchaseAlbumActions.verifyProductInCart(productName);
        Assert.assertTrue(isPresent, "Product not found in cart!");
    }
    
    @When("User logs in using credentials")
    public void user_logs_in_using_credentials(DataTable dataTable) {
        List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
        String email = credentials.get(0).get("email");
        String password = credentials.get(0).get("password");
        loginActions.performLogin(email, password);
    }

    
//    @Then("User logs out")
//    public void user_logs_out() {
//        purchaseAlbumActions.logout();
    }

