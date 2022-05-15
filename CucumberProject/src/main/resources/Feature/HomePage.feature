Feature: Amazon Login

Scenario: Verify the Home Page

Given User is on LoginPage
When User enters Username and Password
And User click on Loginbtn
Then User is on HomePage
