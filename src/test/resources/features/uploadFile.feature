Feature: File Upload feature
  As a User I should be able to upload a file to the Appreciation module

  Background: User in logged in
    Given User is on the login page
    When User enters "<username>" & "<password>"
    Then User should see Activity Stream page title


    @Scenario_fileUpload
    Scenario: User is uploading a file
      When User clicks the More tab
      When  User selects the Appreciation module
      When User clicks on Upload Files icon
      When  User selects the Upload files and images button
      When User selects local file
      When  User clicks the Send button
      Then User should see file appear in the Activity Stream



