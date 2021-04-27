Feature: logout feature
  As a User I should be able to logout


  Background: User in logged in
    Given User is on the login page
    When User enters "<username>" & "<password>"
    Then User should see Activity Stream page title

    @Scenario_logout
    Scenario: User logs out
      When User clicks on username profile
      And  User selects log out button
      Then User should see Authorization title