Feature: Verifies UI Schedule with database
@wip12 @db
  Scenario: Get UI schedule information
    Given User logs in with "emaynell8f@google.es" and "besslebond"
    When User navigates to my Schedule page
    And User gets reserved room name from UI reservation info
    And User gets reserved room name from database information
    Then UI room name is same as DB room name


