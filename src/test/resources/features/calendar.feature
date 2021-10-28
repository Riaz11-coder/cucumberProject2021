Feature: Add Calendar Events
  As a User I should be able to add an event on the Calendar Module

  Background: Background: User in logged in
    Given User is on the login page
    When User enters "<username>" & "<password>"
    Then User should see Activity Stream page title
    @Scenario_calendar
    Scenario: User adds an event to the Calendar
      When User selects Calendar tab
      And User clicks the Add button
      And User selects a name for the event
      And User selects an event date and time
