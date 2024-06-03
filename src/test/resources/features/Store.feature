Feature: Store Locator Functionality
  User Story:
  As a user, I should be able to see the locations in London

  Scenario: User should be able to see the London stores
    Given user is on the home page
    And user clicks the store locator button
    And user enters his location into the search field
    And user select first option
    And user scrolls down and up
    And user goes back to previous page
    Then user should see the main page