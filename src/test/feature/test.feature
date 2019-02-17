# language: en

@mail
Feature: Mail test

  Scenario: Login to mail
    Given site mail.ru is open
    When User logging in with correct username and password
    Then main mail page opens

  Scenario: View incoming letters
    Given site mail.ru is open
    And User logging in with correct username and password
    When User opens received letter
    Then he sees the contents of the letter

