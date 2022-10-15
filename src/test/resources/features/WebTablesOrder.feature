@wip
Feature: Web table user order feature
Scenario: User should be able to order and order seen in web table
  Given user is logged in an on order page
  When user selects product type "Familybea"
  And user enters quantity 2
  And user enters customer name "Sherlock Holmes"
  And user enters street "221b Baker Street"
  And user enters city "London"
  And user enters state "England"
  And user enters zip 55053
  And user selects credic card "MasterCard"
  And user enters card number "2222444455556666"
  And user enters expire date "12/14"
  And user clicks process order button
  Then user shoul see "Sherlock Holmes" in the first row of table