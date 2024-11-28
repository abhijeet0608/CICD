Feature: Validate login functionality for dummy test users

  Scenario: Validate login functionality for dummy test users
    Given User is at signup page
    When User enters the necessary details for creating an account
      | FName   | LName   | EID            | PhNo         |
    Then User clicks on the Signup Button
    And Upon successful signup, the user is created
