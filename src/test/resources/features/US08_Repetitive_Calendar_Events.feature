@B31G6-219
Feature: user should be able to create repetitive calendar events

  Background:
    Given the user is on the login page

  @B31G6-239
  Scenario Outline: user should see the number “1” by default in the Repeat Every input.
    When the user logged in as "<userType>"
    And user hovers over Activities
    And clicks Calendar Events
    And clicks Create Calendar Event
    And checks the Repeat checkbox
    Then user should see number 1 displayed by default in the Days space
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |

  @B31G6-240
  Scenario Outline: user should see “This value should not be blank.” error message when Days space is empty
    When the user logged in as "<userType>"
    When user hovers over Activities
    And clicks Calendar Events
    And clicks Create Calendar Event
    And checks the Repeat checkbox
    And user clears the Days space
    Then user should see “This value should not be blank.” error message
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |

