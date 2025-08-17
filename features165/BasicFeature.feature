@tag
Feature: Login validation

  @reg
  Scenario: Validate positive login
    Given User opens browser
    Then User loads URL
    When User enters user name and password
    Then User click on submit button
    And User validates login is succesful
    Then User Close the browser

  @reg
  Scenario: Validate positive login
    Given User opens browser
    Then User loads URL
    When User enters user name and password
    Then User click on submit button
    And User validates login is succesful
    Then User Close the browser
