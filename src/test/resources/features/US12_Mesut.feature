@wipUS#12
Feature:As a user, I want to filter customers’ info on the
  Account page.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify filter options are available
    Given the user logged in as "<userType>"
    When user clicks on Customers
    And user clicks on Accounts
    And user clicks on the filter button
    Then user should see "Account Name, Contact Name, Contact Email, Contact Phone, Owner, Business Unit, Created At, Updated At" filter options


    Examples:
      | userType      |
#      | sales manager |
      | store manager |