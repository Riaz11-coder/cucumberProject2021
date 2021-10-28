Feature: login feature
  As a user I should be able to login with the proper credentials



  @Scenario_1
  Scenario: Login as helpDesk
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User should be able to see Activity Stream page title

  @Scenario_2
  Scenario: Login as marketing
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User should be able to see Activity Stream page title
  @Scenario_3
  Scenario: Login as humanResources
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User should be able to see Activity Stream page title

    @smoke_test
    Scenario Outline: Login using different credentials <username>
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then User should be able to see Activity Stream page title

      Examples:
      |username                     |password|
      |helpdesk5@cybertekschool.com |UserUser|
      |marketing5@cybertekschool.com|UserUser|
      |hr5@cybertekschool.com       |UserUser|




