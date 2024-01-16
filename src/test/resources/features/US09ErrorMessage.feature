 @smoke
Feature: user should see error messages when I enter an invalid integer number into the calendar Repeat Every input box
  Background: Given user is on the login page

    Scenario Outline: Verify user should see error messages when enter invalid integers
      Given the user logged in as "<userType>"
      And user hovers over Activities
      Then clicks Calendar Events
      And clicks Create Calendar Event
      And checks the Repeat checkbox
      When user enter less than one in Repeat Every days box
      Then users should see "The value have not to be less than 1."
      When user  enter more than ninety-nine
      Then users should see "The value have not to be more than 99."


      Examples:
      |userType|
      | driver        |
      | store manager |
      | sales manager |

