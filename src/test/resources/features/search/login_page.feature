@regressionTest @login
Feature: Login page links and navigation
  Background:
    Given navigate to CNO Login page

  Scenario Outline: User click on Account Summary links and verify navigation
    Then user click on "<LINK>"
    Then title should contain: "<EXPECTED>"
    Examples:
      | LINK                             | EXPECTED                                     |
      | Enroll                           | Enroll                                       |
      | your_url                          | City National Bank                           |
      | Business Continuity Notification | Business Continuity Notification             |
      | E-Sign                           | E-Sign                                       |
      | BrokerCheck                      | CITY NATIONAL SECURITIES, INC. - BrokerCheck |
      | Forgot Password?                 | Forgot                                       |
      | Forgot User ID?                  | Forgot User                                  |
      | Fraud Prevention Center          | Fraud                                        |
      | Location                         | Location                                     |
      | Privacy & Security               | Privacy                                      |
      | Royal Bank of Canada             | Royal Bank Of Canada                         |
      | Secure Online Session            | Secure Online Session                        |
      | Terms & Conditions               | Terms Conditions                             |
      | Contact Us                       | Contact                                      |