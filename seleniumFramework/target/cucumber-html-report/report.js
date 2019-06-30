$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Manmeet Kaur/projectEmirates/seleniumFramework/src/main/java/com/emirates/assignment/features/flightSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Verify the functionality of flight search on emirates.com",
  "description": "",
  "id": "verify-the-functionality-of-flight-search-on-emirates.com",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should be able to search the flight",
  "description": "",
  "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "that the user is on Emirates.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters the \"\u003cDeparture_Port\u003e\" and \"\u003cArrival_Port\u003e\" destinations and journey as one way",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects the flying dates",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "clicks on the search flights button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Flight Search Screen is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the browser is closed",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight;",
  "rows": [
    {
      "cells": [
        "Departure_Port",
        "Arrival_Port"
      ],
      "line": 12,
      "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight;;1"
    },
    {
      "cells": [
        "DXB",
        "LHR"
      ],
      "line": 13,
      "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight;;2"
    },
    {
      "cells": [
        "DEL",
        "DXB"
      ],
      "line": 14,
      "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "User should be able to search the flight",
  "description": "",
  "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "that the user is on Emirates.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters the \"DXB\" and \"LHR\" destinations and journey as one way",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects the flying dates",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "clicks on the search flights button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Flight Search Screen is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSearchStepDefinition.navigate_to_emirates_home_page()"
});
formatter.result({
  "duration": 14913944800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DXB",
      "offset": 21
    },
    {
      "val": "LHR",
      "offset": 31
    }
  ],
  "location": "FlightSearchStepDefinition.enter_departure_arrival_dates(String,String)"
});
formatter.result({
  "duration": 6106277200,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.select_flightTypes()"
});
formatter.result({
  "duration": 356008600,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.select_flying_and_return_dates()"
});
formatter.result({
  "duration": 18918146300,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.verify_flight_search_screen()"
});
formatter.result({
  "duration": 70048200,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.browser_is_closed()"
});
formatter.result({
  "duration": 2158110200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should be able to search the flight",
  "description": "",
  "id": "verify-the-functionality-of-flight-search-on-emirates.com;user-should-be-able-to-search-the-flight;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "that the user is on Emirates.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the user enters the \"DEL\" and \"DXB\" destinations and journey as one way",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user selects the flying dates",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "clicks on the search flights button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Flight Search Screen is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the browser is closed",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSearchStepDefinition.navigate_to_emirates_home_page()"
});
formatter.result({
  "duration": 8282370600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DEL",
      "offset": 21
    },
    {
      "val": "DXB",
      "offset": 31
    }
  ],
  "location": "FlightSearchStepDefinition.enter_departure_arrival_dates(String,String)"
});
formatter.result({
  "duration": 11017795300,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.select_flightTypes()"
});
formatter.result({
  "duration": 369335100,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.select_flying_and_return_dates()"
});
formatter.result({
  "duration": 16427006300,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.verify_flight_search_screen()"
});
formatter.result({
  "duration": 76653700,
  "status": "passed"
});
formatter.match({
  "location": "FlightSearchStepDefinition.browser_is_closed()"
});
formatter.result({
  "duration": 2102518800,
  "status": "passed"
});
});