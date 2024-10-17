@SignUp

Feature: SignUp functionality

Background:
Given user clicks on continue
    
Scenario: User tries to create account with incorrect input 
When user clicks on Login icon
And user enters a emailID
And user clicks on continue button on login page
And user enters an invalid password
And user clicks on create account
Then an error message is displayed 

Scenario: User tries to create account with invalid email
When user clicks on Login icon
And user enters invalid emailID
And user clicks on continue button on login page
Then user gets an error message