package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {
        "src/test/resources/DemoLogin.feature",
        "src/test/resources/PurchaseAlbum.feature",
        "src/test/resources/AddToWishlist.feature"
    },
    glue = {"com.definitions", "com.utils"},
    //tags = "@Login or @DigitalDownloads",
    plugin = {
        "pretty", 
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class RunnerFile extends AbstractTestNGCucumberTests {
}