
Feature: After logging in i should be able to create a user

  @TC_002
  Scenario Outline: Create user
    Given User in the Actitime home page
    When User click on users tab
    Then user click on new user button
    Then user fill in user data
    Then user click on submit
    Then user should be added successfully
    Examples:
      |  |
