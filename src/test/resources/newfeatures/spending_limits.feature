Feature: Veification links and navigation on Account Summary page
  Background:
    Given navigate to CNO Login page
    When user logged in using username as "" and password as "Passwd_1234test"
#
  Scenario Outline: User click on Account Summary links and verify navigation
    Then user click on "<LINK>"
    Then title should contain: "<EXPECTED>"
    Examples:
      | LINK                                    | EXPECTED                                |
      | Message Center                          | Message Center                          |
      | Account Summary                         | Account Summary                         |
      | Contact Us                              | Contact Us                              |

  Scenario Outline: User click on Account Summary top navigation links and verify navigation
    Then click on "<LINK>" from top navigation menu: "<TOP_MENU>"
    Then title should contain: "<EXPECTED>"
    Examples:
      | TOP_MENU           | LINK                                    | EXPECTED                                |
      |My Accounts         | Online Banking                          | Online Banking                          |
      |My Accounts         | Brokerage                               | Brokerage                               |
      |My Accounts         | Trust and Investment - Portfolio Review | Trust and Investment - Portfolio Review |
      |My Accounts         | Trust and Investment Statements         | Trust and Investment Statements         |
      |Payments & Transfers| Make Payments                           | Make Payments                           |
      |Payments & Transfers| Transfer Funds                          | Transfer Funds                          |
      |Payments & Transfers| Brokerage Funds Transfer                | Brokerage Funds Transfer                |
      |Payments & Transfers| Wire Transfer Request                   | Wire Transfer Request                   |
      |Payments & Transfers| Outgoing Wire Activity                  | Outgoing Wire Activity                  |
      |Open an Account     | Checking & Savings                      | Checking & Savings                      |
      |Open an Account     | Current Interest Rates                  | Current Interest Rates                  |
      |Open an Account     | Credit Cards                            | Credit Cards                            |
