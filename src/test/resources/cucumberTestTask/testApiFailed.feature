Feature: Testing API errors

  Scenario: Check weather without "access_key" parameter
    Given I send a request with parameter "access_key" and ""
      And Request with valid parameter query
    Then status code is 101 and "You have not supplied an API Access Key. [Required format: access_key=YOUR_ACCESS_KEY]"

  Scenario: Check weather without "query" parameter
    Given I send a request with parameter "query" and ""
      And Request with valid parameter access_key
    Then status code is 601 and "Please specify a valid location identifier using the query parameter."

  Scenario: Check weather without "query" parameter
    Given I send a request with parameter "query" and "wrongQuery"
     And Request with valid parameter access_key
    Then status code is 615 and "Your API request failed. Please try again or contact support."

  Scenario: Check weather without "query" parameter
    Given I send a request with parameter "units" and "wrongUnit"
      And Request with valid parameter query
      And Request with valid parameter access_key
    Then status code is 606 and "You have specified an invalid unit. Please try again or refer to our API documentation."
