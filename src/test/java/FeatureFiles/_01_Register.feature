
Feature: Register Functionality

  Scenario: Register with valid info

    Given Navigate to basqar
    When Click register button
    And Enter personal data
    Then User should register successfully