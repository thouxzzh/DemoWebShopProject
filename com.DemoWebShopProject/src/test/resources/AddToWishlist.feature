@Wishlist
Feature: Add a product to the wishlist

  Scenario: User adds an item to the wishlist after logging in using Excel credentials
    Given user launches the browser and navigates to Demo Web Shop
    When user logs in with credentials from "TestData" sheet and row 1
    And user navigates to Digital Downloads and adds "3rd Album" to the wishlist
   Then the product "3rd Album" should be present in the wishlist
    #And user logs out
