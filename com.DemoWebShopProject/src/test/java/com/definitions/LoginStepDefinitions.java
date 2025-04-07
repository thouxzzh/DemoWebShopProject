////package com.definitions;
////
////
////import com.actions.LoginPageActions;
////import com.utils.HelperClass;
////
////import io.cucumber.java.en.*;
////
////	import org.testng.Assert;
////
////public class LoginStepDefinitions{
////	    LoginActions loginPage = new LoginActions();
////
////	    @Given("user is in the Demo Web Shop application")
////	    public void user_is_on_homepage() {
////	         HelperClass.openPage();
////	    }
////
////	    @When("user logs in with {string} and {string}")
////	    public void user_logs_in(String email, String password) {
////	        loginPage.performLogin(email, password);
////	    }
////
////	    @Then("the user should see the {string}")
////	    	public void the_user_should_see_the_message(String expectedMessage) {
////	    	    Assert.assertTrue(loginPage.isLoginSuccessful(expectedMessage), "Login message mismatch");
////	    	}
////
////	}

//package com.definitions;
//
//import com.actions.LoginActions;
//import com.utils.HelperClass;
//
//import io.cucumber.java.en.*;
//import org.testng.Assert;
//
//public class LoginStepDefinitions {
//
//    LoginActions loginActions = new LoginActions();
//
//    @Given("user is in the Demo Web Shop application")
//    public void user_is_on_homepage() {
//        HelperClass.openPage();
//    }
//
//    @When("user logs in with {string} and {string}")
//    public void user_logs_in(String email, String password) {
//        loginActions.performLogin(email, password);
//    }
//
//    @Then("the user should see the {string}")
//    public void the_user_should_see_the_message(String expectedMessage) {
//        Assert.assertTrue(loginActions.isLoginSuccessful(expectedMessage), "Login validation failed!");
//    }
//}



package com.definitions;

import com.actions.LoginActions;
import com.utils.HelperClass;

import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class LoginStepDefinitions {

    private static final Logger log = LogManager.getLogger(LoginStepDefinitions.class);

    LoginActions loginActions = new LoginActions();

    @Given("user is in the Demo Web Shop application")
    public void user_is_on_homepage() {
        log.info("Opening the Demo Web Shop application");
        HelperClass.openPage();
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in(String email, String password) {
        log.info("Attempting login with Email and Password");
        loginActions.performLogin(email, password);
    }

    @Then("the user should see the {string}")
    public void the_user_should_see_the_message(String expectedMessage) {
        log.info("Verifying login message");
        boolean isValid = loginActions.isLoginSuccessful(expectedMessage);
        Assert.assertTrue(isValid, "Login validation failed");
        log.info("Login test passed with expected message");
    }
}

