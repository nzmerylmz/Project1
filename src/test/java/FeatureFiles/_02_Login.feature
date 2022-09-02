Feature: Login Functionality

  Scenario: Login with valid credentials
    Given Navigate to basqar
    When Enter valid username and password
    Then User should login successfully

  Scenario Outline: Unsuccessful login

    Given Navigate to basqar
    When Enter invalid "<username>" and "<password>"
    Then User should not be logged in
    Examples:
      | username | password |
      | abc      | 123      |
      | def      | 456      |
