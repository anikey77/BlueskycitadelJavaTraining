Feature: Login
  Scenario:Valid login
    Given I navigate to propertyrete website
    When I click on login button
    And I enter my email
    And I enter my password
    And I click on signin button
    Then I am logged in
