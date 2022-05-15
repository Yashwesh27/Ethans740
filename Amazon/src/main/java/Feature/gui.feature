Feature: Amazon_login

 Scenario Outline: EnterLoginCred

 Given user is on login page
 When user click on <Username>
 Then user click on <Password>
 And user click on LoginButton
  
  Examples:
   |Username|Password|
   |Admin|admin123|
   |Asmit|Asmit@123|
   |Shweta|shweta@123|
   

