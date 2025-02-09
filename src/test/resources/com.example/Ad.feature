Feature: Add car in the system

  Scenario Outline: Add Advert
    Given User enters the add advert page
    When User enters title "<title>"
    And User enters description "<description>"
    And User enters price "<price>"
    And User selects car "<car>"
    And User clicks add advert button
    Then User should see message "<message>"

    Examples:
      | title                              | description      | price | car  | message                        |
      | Toyota Yaris 2006, 120hp, diesel   |                  | 5600  | 0    | Advert added successfully!     |
      | Subaru Impreza 2005, 230hp, petrol |                  | 15600 | 0    | Advert added successfully!     |
      | Subaru Impreza 2005, 230hp, petrol |                  | test  | 0    | Price must be a valid number!  |
      | Subaru Impreza 2005, 230hp, petrol | Some description | test  | 0    | Price must be a valid number!  |
      |                                    | Some description | 1200  | 0    | Title is required!             |
      | Opel Astra                         | Some description |       | 0    | Price is required!             |
      | Opel Astra                         | Some description | 2000  | 20   | Car does not exist!            |
      | Opel Astra                         | Some description | 2000  | test | Car id must be a valid number! |
