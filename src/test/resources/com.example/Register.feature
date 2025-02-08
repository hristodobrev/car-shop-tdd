Feature: User Register

  Scenario Outline: Register with valid details
    Given User enters the register screen
    When User enters username "<username>"
    And User enters password "<password>"
    And User enters confirmPassword "<confirmPassword>"
    And User enters name "<name>"
    And User enters email "<email>"
    And User clicks the register button
    Then User sees message "<expectedMessage>"

    Examples:
      | username | password | confirmPassword | name     | email              | expectedMessage                               |
      | John     | 12345678 | 12345678        | John Doe | j.doe@email.com    | User registered successfully!                 |
      | Jane     | 12345678 | 12345678        |          | jane.doe@email.com | User registered successfully!                 |
      | John     | 123      | 123             | John Doe | j.doe@email.com    | Password must be between 8 and 30 characters! |
      | John     | 12345678 | 123             | John Doe | j.doe@email.com    | Password and confirm password do not match!   |
      | John     | 12345678 | 12345678        | John Doe |                    | Email is required!                            |
      | John     | 12345678 | 12345678        | John Doe | invalid            | Email is invalid!                             |
      |          | 12345678 | 12345678        | John Doe | j.doe@email.com    | Username is required!                         |
      | John     |          | 12345678        | John Doe | j.doe@email.com    | Password is required!                         |
      | John     | 12345678 |                 | John Doe | j.doe@email.com    | Confirm password is required!                 |

