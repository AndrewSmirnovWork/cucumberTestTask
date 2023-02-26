Feature: Testing API errors

  Scenario: Check weather without "query" parameter
    When query is not in parameters
    Then status code is 101 and "You have not supplied an API Access Key. [Required format: access_key=YOUR_ACCESS_KEY]"

#  Scenario: Check weather without "query" parameter
#    When access key is not in parameters
#    Then status code is 601 and "Please specify a valid location identifier using the query parameter."
#
#  Scenario: Check weather without "query" parameter
#    When wrong query in parameters
#    Then status code is 615 and "Your API request failed. Please try again or contact support."
#
#  Scenario: Check weather without "query" parameter
#    When wrong units in parameters
#    Then status code is 606 and "You have specified an invalid unit. Please try again or refer to our API documentation."
