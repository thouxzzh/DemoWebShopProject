package com.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        HelperClass.setUpDriver();
    }

    @After
    public void tearDown() {
        HelperClass.tearDown(); 
    }
}
