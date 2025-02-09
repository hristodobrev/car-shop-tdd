Feature: Add car in the system

  Scenario Outline: Add car
    Given User enters the add car page
    When User enters make "<make>"
    And User enters model "<model>"
    And User enters horse power "<horsePower>"
    And User enters year "<year>"
    And User enters engine type "<engineType>"
    And User clicks add car button
    Then User is presented with message "<message>"

    Examples:
      | make   | model   | horsePower | year | engineType | message                                      |
      | Toyota |         |            |      | diesel     | Car added successfully!                      |
      | Subaru | Impreza | 230        | 2006 | petrol     | Car added successfully!                      |
      | Mazda  |         | 100        | 2008 | diesel     | Car added successfully!                      |
      | Opel   | Astra   |            |      | petrol     | Car added successfully!                      |
      | Alfa   | 147     | 120        |      | petrol     | Car added successfully!                      |
      | Alfa   | 147     | 120        |      |            | Engine Type is required!                     |
      |        |         |            |      |            | Make is required!                            |
      |        |         |            |      | diesel     | Make is required!                            |
      | Alfa   | 147     | test       |      | diesel     | Horse Power must be a valid number!          |
      | Alfa   | 147     |            | test | diesel     | Year must be a valid number!                 |
      | Alfa   | 147     |            |      | test       | Engine type must be either diesel or petrol! |
