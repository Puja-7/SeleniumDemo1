

Feature: Vtiger Login Feature
  Scenario: Vtiger Login Test Scenario
    Given user is already on login page
    When title of login page is vtiger
    Then user enters username and password
       Then user is on home page
       Then close Browser

 