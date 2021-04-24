Feature: login
  As a user I should be able to login with the proper credentials

#  Background:
#    Given user is on enviroment login page
#    Then user should see Authorization title

  @Scenario_1
  Scenario: Login as helpdesk
    Given user is on login page
    When user logs in as helpdesk
    Then user should be able to see Activity Stream page title

  @Scenario_2
  Scenario: Login as marketing
    Given user is on login page
    When user logs in as marketing
    Then user should be able to see Activity Stream page title

  @Scenario_3
  Scenario: Login as HR
    Given user is on login page
    When user logs in as HR
    Then user should be able to see Activity Stream page title

    @Scenario_outline
    Scenario Outline: Login using different credentials <username>
      Given User is on login page
      When User "<username>" and "<password>"
      Then User should be able to see Activity Stream page title

      Examples:
      |username                      |password|
      |helpdesk5@cybertekschool.com  |UserUser|
      |marketing5@cybertekschool.com |UserUser|
      |hr5@cybertekschool.com        |UserUser|





