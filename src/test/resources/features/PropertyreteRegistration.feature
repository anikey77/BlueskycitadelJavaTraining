Feature: Registration

  Scenario: Valid registration
    Given I navigate to propertyrete site
    When I click on register button
    And I enter firstname
    And I enter lastname
    And I enter email
    And I select country flag
    And I enter  phone number
    And I enter password
    And I confirm password
    And I click on create account button
    And an error message was received
    Then I am not registered