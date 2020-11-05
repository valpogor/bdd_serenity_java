@regressionTest @summary
Feature: Veification links and navigation on Account Summary page with Credit cards
  Background:
    Given navigate to CNO Login page
    When user logged with OOBA in using username as "user" and password as "password"

  Scenario Outline: User click on Account Summary top navigation links and verify navigation
    Then click on "<LINK>" from top navigation menu: "<TOP_MENU>"
    Then title should contain: "<EXPECTED>"
    Examples:
      | TOP_MENU           | LINK                 | EXPECTED             |
      |My Accounts         | Alerts               | Alerts               |
      |My Accounts         | Lock and Unlock card | Lock and Unlock card |
      |My Accounts         | Paperless Enrollment | Paperless Enrollment |
      |My Accounts         | Spending Limits      | Spending Limits      |
      |My Accounts         | Statements           | Statements           |
      |My Accounts         | Transactions         | Transactions         |
      |Payments & Transfers| Credit Card Payments | Credit Card Payments |
