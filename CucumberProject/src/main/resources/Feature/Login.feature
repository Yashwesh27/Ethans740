Feature: OrangeHRMLogin

Scenario Outline: UserCredentialLogin

Given User is on loginpage
Then User enters credentials using Username as <username> and Password as <password>
And User click on Loginbtn
Then User is on HomePage

Examples:
|username|password|
|Vijay|Password1|
|Pankaj|Password2|
|Kalpesh|Password3|
|Tom|Password4|
