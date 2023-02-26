Feature: Testing a REST API
  Users should be able to submit GET requests to a web service

  Scenario: Check weather in city
    Given user want to get information about weather in "New York"
    Then Status code is 200
    And the requested data about city is returned

#    Given user want to get information about weather in "Los Angeles"
#    Then Status code is 200
#    And the requested data about city is returned
#
#    Given user want to get information about weather in "Los Angeles"
#    Then Status code is 200
#    And the requested data about city is returned
#
#    Given user want to get information about weather in "Los Angeles"
#    Then Status code is 200
#    And the requested data about city is returned