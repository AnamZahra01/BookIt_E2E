Feature: Verify the info from all environment

  Scenario: Get the info from UI
    Given User logs in with "sbirdbj@fc2.com" and "asenorval"
    When User navigates to mySelf page
    Then User gets the UI info

  @db
  Scenario: Get the info from DB
    When User sends a query to DataBase with "sbirdbj@fc2.com"
    Then User gets DataBase information

  Scenario: Verify all environments
    When User sends a query to DataBase with "sbirdbj@fc2.com"
    Then User gets DataBase information
    Given User logs in with "sbirdbj@fc2.com" and "asenorval"
    When User navigates to mySelf page
    Then User gets the UI info
    Then User verifies UI info with DB
