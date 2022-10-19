
Feature: Gmail Login
Scenario Outline: Gmail Login validation
Given user is on login page
Then user enter <username> and <password>
Then click on login button
Then Close browser

Examples: 
	|username|password|
	|mitkari.puja07@gmail.com|pujashivap7|
	|puja.77777@gmail.com|shivpujap|

	