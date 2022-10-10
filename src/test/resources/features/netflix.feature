Feature: Netflix film suggestion functionality
  As a user I should search film type and see relevant suggestions

  @netflix
  Scenario: Movie search
    Given I like "actions"
    And I like "drama"
    And I like "western"
    And I like "romance"
    And I dont like "comedy"
    When I go homepage
    Then I should see suggestions

  @netflix
  Scenario: Movie searh datatable list
    Given I like
      | actions |
      | drama   |
      | western |
    When I go homepage
    Then I should see suggestions

  @netflix
  Scenario: Movie search datatable map
    Given I like movies with type
      | War         | action |
      | Forest gump | drama  |
      | Honest man  | comedy |
    When I go homepage
    Then I should see suggestions