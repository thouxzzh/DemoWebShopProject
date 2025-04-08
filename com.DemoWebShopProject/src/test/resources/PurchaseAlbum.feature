
#@DigitalDownloads
#Feature: Click the item and add it to the cart
  #@Purchase
  #Scenario Outline: User login and purchase 3rd Album
    #Given User launches the browser and navigates to Demo Web Shop
    #When User logs in using "<email>" and "<password>"
    #And User navigates to Digital Downloads and purchases "3rd Album"
    #Then The product "3rd Album" should be present in the cart
    #And User logs out
#
    #Examples:
      #| email               | password     |
      #| 2k21dhar@gmail.com  | Dhar@123     |
      #
     #
     
@DigitalDownloads
Feature: Click the item and add it to the cart

  @Purchase
  Scenario: User login and purchase 3rd Album using DataTable
    Given User launches the browser and navigates to Demo Web Shop
    When User logs in using credentials
      | email              | password  |
      | 2k21dhar@gmail.com | Dhar@123  |
    And User navigates to Digital Downloads and purchases "3rd Album"
    Then The product "3rd Album" should be present in the cart
    #And User logs out
     
