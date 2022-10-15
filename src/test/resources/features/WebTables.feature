
Feature: Login to web tables app and dropdown
  User Story1:
  User login the webtable

  User Story2:
  User login the cydeo dropdown page and sees all 12 months in months dropdown

  Scenario: User log in web tables app
    Given user is on page "https://web-table-2.cydeo.com/login"
    When user enters below credentials
      | username | Test   |
      | password | Tester |
    Then user should see url contains "orders"


  Scenario: User should be able to see all 12 months in months dropdown
    Given user is on the page "https://practice.cydeo.com/dropdown"
    When user clicks on months dropdown
    Then user should see the months belove
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |


