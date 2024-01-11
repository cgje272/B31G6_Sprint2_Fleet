Feature: Login page functionality
  Agile story: As a user, I should access to the Oroinc Documentation page. (Window handle)
//Background:
  Background: User is already in the log in page
    Given the user is on the login page



@B31G6-236
  Scenario Outline:  Oroinc Documentation page URL verification
    //Given user is on the XFLEET login page
    When  user login with below credentials "<username>","<password>"
    When user clicks on the question mark icon
    Then new page url should be https://doc.oroinc.com/

    Examples:
      | username        | password    |
      | user1           | UserUser123 |
      | storemanager51  | UserUser123 |
      | salesmanager101 | UserUser123 |