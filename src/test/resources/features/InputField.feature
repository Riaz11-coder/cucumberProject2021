Feature: Input Fields feature
	As a User I should be able to input a message

	
	@Scenario_InputFields
	Scenario: User inputs message
		Given User is on landing page
		When  User inputs message into input field 
		And User clicks Show Message button
		Then User message is displayed