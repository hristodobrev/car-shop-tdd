Feature: Login in the system
    Scenario: Login with correct username and password
        Given User enters the login screen
        When enters username "John"
        And enters password "123456"
        And clicks the login button
        Then sees message "Successfully logged in!"

    Scenario: Login without username
        Given User enters the login screen
        When enters password "123456"
        And clicks the login button
        Then sees message "Incorrect username or password!"

    Scenario: Login without password
        Given User enters the login screen
        When enters username "John"
        And clicks the login button
        Then sees message "Incorrect username or password!"

    Scenario: Login with incorrect password
        Given User enters the login screen
        When enters username "John"
        And enters password "654321"
        And clicks the login button
        Then sees message "Incorrect username or password!"

    Scenario: Login with incorrect username
        Given User enters the login screen
        When enters username "Steve"
        And enters password "123456"
        And clicks the login button
        Then sees message "Incorrect username or password!"