Feature: Login Functionality of Facebook

Background:
When Launch the browser by using config file.
And hit the browser



@restAssuredTest  @new_user
Scenario: Validate login functionality for new user.
Given user is launching the facebook application in browser.
When user clicks on signup button
And user enters valid personal details as firstname "abhijeet" and lastname "gavali"
And user enters valid email_id "abhijeetgavali30@gmail.com" and phone_no "9766107297"
And user sets the valid password "Abhi@123"
And User needs to provide username 9766107297 and password AbhiAug8
And user clicked on login button.
Then user landed on homepage of facebook

@regressionTest @mobileTest  @existing_user
Scenario Outline: Login Functionality of Facebook for existing users.
Given user is launching the facebook application in browser.

When User needs to provide username <UserName> and password <Password>
And user clicked on login button.
Then user landed on homepage of facebook

Examples:
| UserName | Password | 
| abc@gmail.com | Password1 | 
| abcd@gmail.com | Password2 | 
| abcde@gmail.com | Password3 | 
| abcdef@gmail.com | Password4 | 
| xyz@gmail.com | Password5 | 

@smokeTest @regressionTest @dummy_user
  Scenario: Validate login functionality for dummy test users
    Given User is at signup page
    When User enters the necessary details for creating an account
      | FName   | 
      | LName   | 
      | EID     |      
      | PhNo    |
    Then User clicks on the Signup Button
    And Upon successful signup, the user is created
