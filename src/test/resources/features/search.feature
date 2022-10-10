@search
Feature: Google search functionality
  Agile User Story: As a user, when I am on Google search page
  I can type anything to google search box and see relevant search results

  Background: For the scenarios user is expected to be on Google search page
    Given user is on Google search page

  Scenario: Seach-page title verification
    When user is on Google search page
    Then user should see title is Google

    Scenario: Search functionality result title verification
      When user is on Google search page
      And user types apple and clicks enter key
      Then user should see apple in title


