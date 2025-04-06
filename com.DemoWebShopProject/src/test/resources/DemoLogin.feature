@DigitalDownloads
Feature: I want to login to the application 

  @Login
  Scenario Outline: Login with valid and invalid credentials
    Given user is in the Demo Web Shop application
    When user logs in with "<email>" and "<password>"
    Then the user should see the "<LoginStatus>"

    Examples:
      | email                     | password  | LoginStatus     |
      | 2k21dhar@gmail.com        | Dhar@123  | Login passed    |
      | demo@example.com          | demo@123  | Login failed    |