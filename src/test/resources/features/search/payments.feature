@regressionTest @payments
Feature: Veification links and navigation on Account Summary page with Credit cards
  Background:
    Given navigate to CNO Login page
    When user logged with OOBA in using username as "user" and password as "password"

  Scenario: User able to scheduled a payment
    When user able to scheduled a payment

  Scenario: User able to update a payment
    When user able to update a payment

  Scenario: User able to cancel a payment
    When user able to cancel a payment