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
//        String email = ExcelUtils.getCellData(sheetName, rowNum, 0);
//        String password = ExcelUtils.getCellData(sheetName, rowNum, 1);
//        login.performLogin(email, password);
    	ExcelUtils.setExcelFile("C:\\Users\\thous\\git\\DemoWebShopProject\\com.DemoWebShopProject\\src\\test\\resources\\TestData.xlsx", "Sheet1");
    	String username = ExcelUtils.getCellData(1, 0); 
    	String password = ExcelUtils.getCellData(1, 1); 
    }

//    @When("user navigates to Digital Downloads and adds {string} to the wishlist")
//    public void user_navigates_to_digital_downloads_and_adds_to_the_wishlist(String product) {
//        wishlist.navigateToDigitalDownloads();
//        wishlist.addProductToWishlist(product);
//    }
    
    @When("user navigates to Digital Downloads and adds {string} to the wishlist")
    public void user_navigates_to_digital_downloads_and_adds_to_the_wishlist(String product) {
        wishlist.navigateToDigitalDownloads();
        wishlist.addProductToWishlist(product);
        wishlist.openWishlistPage(); // 👈 Move here to verify wishlist page after adding
    }
    
    @Then("the product {string} should be present in the wishlist")
    public void the_product_should_be_present_in_the_wishlist(String product) {
        assert wishlist.isProductInWishlist(product); // ✅ now verifies from wishlist page
    }



//    @Then("the product {string} should be present in the wishlist")
//    public void the_product_should_be_present_in_the_wishlist(String product) {
//        wishlist.openWishlistPage();
//        assert wishlist.isProductInWishlist(product);
//    }

//    @Then("user logs out")
//    public void user_logs_out() {
//        wishlist.logout();
//    }
//}

//package com.definitions;
//
//import com.actions.LoginActions;
//import com.actions.WishlistActions;
//import com.utils.ExcelUtils;
//import com.utils.HelperClass;
//
//import io.cucumber.java.en.*;
//
//public class WishlistDefinitions {
//
//    LoginActions login = new LoginActions();
//    WishlistActions wishlist = new WishlistActions();
//
//    @Given("user launches the browser and navigates to Demo Web Shop")
//    public void user_launches_the_browser_and_navigates_to_demo_web_shop() {
//        HelperClass.openPage();
//    }
//
//    @When("user logs in with credentials from {string} sheet and row {int}")
//    public void user_logs_in_with_credentials_from_sheet_and_row(String sheetName, Integer rowNum) {
//        String path = "src/test/resources/TestData.xlsx";
//        String email = ExcelUtils.getCellData(path, sheetName, rowNum, 0);
//        String password = ExcelUtils.getCellData(path, sheetName, rowNum, 1);
//        login.performLogin(email, password);
//    }
//
//    @When("user navigates to Digital Downloads and adds {string} to the wishlist")
//    public void user_navigates_to_digital_downloads_and_adds_to_the_wishlist(String product) {
//        wishlist.navigateToDigitalDownloads();
//        wishlist.addProductToWishlist(product);
//    }
//
//    @Then("the product {string} should be present in the wishlist")
//    public void the_product_should_be_present_in_the_wishlist(String product) {
//        wishlist.openWishlistPage();
//        assert wishlist.isProductInWishlist(product);
//    }
//
//    @Then("user logs out")
//    public void user_logs_out(){
//        wishlist.logout();
//    }
}


