Feature: Verify the functionality of flight search on emirates.com

  Scenario Outline: User should be able to search the flight
    Given that the user is on Emirates.com
    When the user enters the "<Departure_Port>" and "<Arrival_Port>" destinations and journey as one way
    And user selects the flying dates
    And clicks on the search flights button
    Then Flight Search Screen is displayed
    And the browser is closed

    Examples: 
      | Departure_Port | Arrival_Port |
      | DXB            | LHR          |
      | DEL            | DXB          |
