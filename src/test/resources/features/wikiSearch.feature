Feature: Wikipedia Search Functionality
  User story: User is able to search names and see the names on title, header and image

  Background:
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    And user clicks wiki search button

  Scenario: Wikipedia Search Functionality Title Verification
    Then user sees "Steve Jobs" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Then user sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Then user sees "Steve Jobs" is in the image header
