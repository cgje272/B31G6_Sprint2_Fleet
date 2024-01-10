@wipUS#08
Feature: user should be able to create repetitive calendar events
  
  Background:
    Given the user is on the login page
    And the user logged in as "driver"

    Scenario: user should see the number “1” by default in the Repeat Every input.
      When user hovers over Activities
      And clicks Calendar Events
      And clicks Create Calendar Event
      And checks the Repeat checkbox
      Then user should see number 1 displayed by default in the Days space


