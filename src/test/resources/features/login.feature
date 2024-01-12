Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

  #This inputs the info you have inside your config.properties
  # Given the user logged in with username as "User1" and password as "UserUser123"
