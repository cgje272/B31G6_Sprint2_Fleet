
Feature: Vehicles page feature
  User Story:
  As a user (Sales and Store manager), I should be able to select any vehicle from the Vehicles page (web table)
  AC #1: Verify that once the users launch on the Vehicles page, the users can see all the checkboxes as unchecked.
  AC #2: Verify that users can check the first checkbox to select all the cars
  AC #3: Verify that users can select any car


  Scenario: Search result vehicles page verification
    Given user is on the main page
    When user selects Vehicles page
    Then user can see all checkboxes as unchecked

  @wipUS#07
    Scenario: Checkbox verification for all the cars
      Given user is on the Vehicles page
      Then user can check the first checkbox to select all the cars

    Scenario: Verify that users can select any car
      Given user is on the Vehicles page
      Then user can select any car
