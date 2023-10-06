Feature: Careers Functionality
  User Story:
  As a user, I should be able to search job opportunities


  Scenario: User should be able to see all the job ads
    Given user is on the home page
    And user clicks the about us button
    And user clicks the about RSA button
    And user scrolls down and up
    And user goes back to previous page
    Then user should see the main page