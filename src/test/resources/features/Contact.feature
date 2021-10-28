Feature: contact_Us
	As a user, I should be able to use the customer service module

	Background: user is on eCommerce page
		Given User enters url

	#CRM test case 1
	@Scenario_Contact_Us
	Scenario: Cucumber 2021

		    When User clicks the Contact Us button
		    And User selects a subject
		    And User inputs a valid email address
		    And User inputs an order number
		    And User inputs a message
		    And User clicks the Send button
		    Then User should see a confirmation message