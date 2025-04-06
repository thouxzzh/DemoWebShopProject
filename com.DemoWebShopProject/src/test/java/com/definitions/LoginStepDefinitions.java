//package com.definitions;
//
//
//import com.actions.LoginPageActions;
//import com.utils.HelperClass;
//
//import io.cucumber.java.en.*;
//
//	import org.testng.Assert;
//
//public class LoginStepDefinitions{
//	    LoginActions loginPage = new LoginActions();
//
//	    @Given("user is in the Demo Web Shop application")
//	    public void user_is_on_homepage() {
//	         HelperClass.openPage();
//	    }
//
//	    @When("user logs in with {string} and {string}")
//	    public void user_logs_in(String email, String password) {
//	        loginPage.performLogin(email, password);
//	    }
//
//	    @Then("the user should see the {string}")
//	    	public void the_user_should_see_the_message(String expectedMessage) {
//	    	    Assert.assertTrue(loginPage.isLoginSuccessful(expectedMessage), "Login message mismatch");
//	    	}
//
//	}

package com.definitions;

import com.actions.LoginActions;
import com.utils.HelperClass;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginStepDefinitions {

    LoginActions loginActions = new LoginActions();

    @Given("user is in the Demo Web Shop application")
    public void user_is_on_homepage() {
        HelperClass.openPage();
    }

    @When("user logs in with {string} and {string}")
    public void user_logs_in(String email, String password) {
        loginActions.performLogin(email, password);
    }

    @Then("the user should see the {string}")
    public void the_user_should_see_the_message(String expectedMessage) {
        Assert.assertTrue(loginActions.isLoginSuccessful(expectedMessage), "Login validation failed!");
    }
}
