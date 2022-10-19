
Feature: ActiTime task creation


  Scenario Outline: ActiTime Task Creation Feature
    Given user is already on login page og actiTime app
    When user enter <uname> and <pwd> and click on login
    Then user should be on home page with <title>
    When user click on task and select create task
    Then User could add task as <task> and  click on Create task button
    Then close browser

    Examples: 
      | uname  | pwd | title  |task|
      | admin | manager     | actiTIME - Enter Time-Track |Testing123|
      | admin   | manager   |actiTIME - Enter Time-Track |FrontEnd|
