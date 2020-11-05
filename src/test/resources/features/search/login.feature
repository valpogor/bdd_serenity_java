@regressionTest @login
Feature: Login Feature
  Background:
    Given User navigate to CNO Login page

  Scenario: Verify Login
    When user logged in using username as "" and password as "Passwd_1234test"
    Then title should contain: "City National Bank - Home page"

  Scenario: Verify Login with OOBA verification
    When user logged in using username as "user" and password as "password"
    And select email: "2" and click submit
    And get OOBA code fill the field and click on submit
    Then Account Summary Page should be displayed