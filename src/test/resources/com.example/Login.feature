Feature: Login in the system

  Scenario: Login with correct username and password
    Given User enters the login screen
    When User enters username "John"
    And User enters password "123456"
    And User clicks the login button
    Then User sees message "Successfully logged in!"

  Scenario: Login without username
    Given User enters the login screen
    When User enters password "123456"
    And User clicks the login button
    Then User sees message "Incorrect username or password!"

  Scenario: Login without password
    Given User enters the login screen
    When User enters username "John"
    And User clicks the login button
    Then User sees message "Incorrect username or password!"

  Scenario: Login with incorrect password
    Given User enters the login screen
    When User enters username "John"
    And User enters password "654321"
    And User clicks the login button
    Then User sees message "Incorrect username or password!"

  Scenario: Login with incorrect username
    Given User enters the login screen
    When User enters username "Steve"
    And User enters password "123456"
    And User clicks the login button
    Then User sees message "Incorrect username or password!"