Feature: loginpage_OrangeHRM
Scenario: Loginpage

Given user is on loginpage
When user enters Credentials
And user click on LoginBtn
Then user is on homepage