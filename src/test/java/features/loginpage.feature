
  @appium
    Feature: Validate Different Options
  Scenario: Validate Custom View
    Given I open the application
    When I tap on Accessibility
    Then I validate Custom View

    Scenario: Validate scroll of screens using different methods
      Given I tap on back button
      When I scroll the View
      Then I validate the text


