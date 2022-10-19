 Feature: ActiTime Activity With BDD_Cucumber


  #Scenario: ActiTime Login
    #Given User is on Actitime login page
    #When title of page is actiTIME Login
    #When user enters valid uname as "admin" and password as "manager" and click on login
    #Then user should be on homePage title should be same as expected
 #		And close the browser
 
 Scenario Outline: Actitime Login Feature
 
Given User is on Actitime login page
    When title of page is actiTIME Login
    When user enters <uname> and <pwd> and click on login
    Then user should be on homePage title should be <Title>
 		And close the browser
 		
 		Examples:
						|uname|pwd|Title|
						|admin|manager|actiTIME - Enter Time-Track|
						|trainee|trainee|actiTIME - Enter Time-Track|
						|admin@123|puja|actiTIME - Login|