@regressionTest @alerts
Feature: Veification links and navigation on Account Summary page with Credit cards
  Background:
    Given navigate to CNO Login page
    When user logged with OOBA in using username as "user" and password as "password"

  Scenario: User able to scheduled a payment
    Then click on "Alerts" from top navigation menu: "My Accounts"
    Then user navigate to Alerts page and select "1" account

