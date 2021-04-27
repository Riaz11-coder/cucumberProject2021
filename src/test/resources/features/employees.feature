Feature: Employee message feature
  As a user I should be able to send a message to another employee

  Background: Background: User in logged in
    Given User is on the login page
    When User enters "<username>" & "<password>"
    Then User should see Activity Stream page title
    @Scenario_employees
    Scenario: User sending a message to another employee
      When User clicks on Employees button
      And  User clicks on Employee profile
      And  User clicks on Send message button
      And  User enters message in the Text box
      Then User should see message in the chat

