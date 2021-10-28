Feature: eCommerce search
  As a User I should be able to search for dresses on an eCommerce website


  @smoke_test
  Scenario: User searches for dresses
    Given User is on eCommerce page
    When User enters dresses into searchBar
    Then User should see dress results