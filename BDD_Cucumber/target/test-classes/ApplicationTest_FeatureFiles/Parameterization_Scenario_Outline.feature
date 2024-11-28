Feature: Login with multiple users.
Scenario Outline: Login Functionality of Facebook for existing users.
Given user is launching the facebook application in browser.

When User needs to provide username "<UserName>" and password "<Password>"
And user clicked on login button.
Then user landed on homepage of facebook

Examples:
| UserName | Password | 
| abc@gmail.com | Password1 | 
| abcd@gmail.com | Password2 | 
| abcde@gmail.com | Password3 | 
| abcdef@gmail.com | Password4 | 
| xyz@gmail.com | Password5 | 