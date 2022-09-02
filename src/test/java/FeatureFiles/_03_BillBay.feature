Feature: Payment Functionality

  Scenario Outline: Login with valid credentials
    Given Navigate to basqar
    When Enter valid username and password
    Then User should login successfully
    And Click on Bill Pay
    When Enter "<payee name>" and "<amount>" and other infos
    Then Payment complete message should be displayed
    Examples:
      | payee name | amount |
      | elektrik  | 85 |
      | su | 45 |
      | dogalgaz | 120 |
