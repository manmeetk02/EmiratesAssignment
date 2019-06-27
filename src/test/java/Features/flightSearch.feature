Feature: Verify the functionality of flight search on emirates.com

  Scenario: User should be able to search the flight
    Given that the user is on Emirates.com
    When the user enters the departure and arrival destinations
    Then selects the journey type
    And user selects the flying and returning dates
    And clicks on the search flights button
    Then Flight Search Screen is displayed

