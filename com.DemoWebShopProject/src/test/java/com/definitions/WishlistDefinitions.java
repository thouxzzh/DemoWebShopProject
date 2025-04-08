package com.definitions;

import java.io.IOException;

import com.actions.LoginActions;
import com.actions.WishlistActions;
import com.utils.ExcelUtils;
import com.utils.HelperClass;

import io.cucumber.java.en.*;

public class WishlistDefinitions{

    LoginActions login = new LoginActions();
    WishlistActions wishlist = new WishlistActions();

    @Given("user launches the browser and navigates to Demo Web Shop")
    public void user_launches_the_browser_and_navigates_to_demo_web_shop() {
        HelperClass.openPage();
    }

    @When("user logs in with credentials from {string} sheet and row {int}")
    public void user_logs_in_with_credentials_from_sheet_and_row(String sheetName, Integer rowNum) throws IOException {
    	ExcelUtils.setExcelFile("C:\\Users\\thous\\git\\DemoWebShopProject\\com.DemoWebShopProject\\src\\test\\resources\\TestData.xlsx", "Sheet1");
    	String username = ExcelUtils.getCellData(1, 0); 
    	String password = ExcelUtils.getCellData(1, 1); 
    }
    
    @When("user logs in with data from {string} sheet and row {int}")
    public void user_logs_in_with_data_from_sheet_and_row(String sheetName, Integer rowNum) throws IOException {
        ExcelUtils.setExcelFile("C:\\Users\\thous\\git\\DemoWebShopProject\\com.DemoWebShopProject\\src\\test\\resources\\TestData1.xlsx", "Sheet1");
        String friendEmail = ExcelUtils.getCellData(rowNum, 0);
        String yourEmail = ExcelUtils.getCellData(rowNum, 1);
        String message = ExcelUtils.getCellData(rowNum, 2);

        wishlist.enterFriendEmail(friendEmail);
        wishlist.enterYourEmail(yourEmail);
        wishlist.enterPersonalMessage(message);
    }
    @And("click Email a friend")
    public void click_email_a_friend() {
        wishlist.clickEmailAFriend(); 
    }
    @And("click send email button")
    public void click_send_email_button() {
        wishlist.sendEmail();
    }
    
    @When("user navigates to Digital Downloads and adds {string} to the wishlist")
    public void user_navigates_to_digital_downloads_and_adds_to_the_wishlist(String product) {
        wishlist.navigateToDigitalDownloads();
        wishlist.addProductToWishlist(product);
        wishlist.openWishlistPage(); 
    }
    
    @Then("the product {string} should be present in the wishlist")
    public void the_product_should_be_present_in_the_wishlist(String product) {
        assert wishlist.isProductInWishlist(product);
    }
}


