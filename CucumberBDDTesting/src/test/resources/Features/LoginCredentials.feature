Feature: User able to login with the valid username and Password (Login Functionlity)
Scenario: User able to login with valid username and verify the page title. 

Given User able to open any browser
Given User able to enter the URL 

When User able click on Signin Button
When User able to enter the Username
And   User able to enter the Password
And  User able to click on the submit Button

Then User able to login Successfully 
And  User able see his/her Name in the home page 
