@register
Feature: register

  Scenario: As a User ,I Should able to register successfully
            so that,I can use all user features
    Given I am on registration page
    When I enter required registration details
    Then I should able to register successfully