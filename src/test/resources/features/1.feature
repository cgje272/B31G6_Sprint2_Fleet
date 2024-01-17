@B31G6-254
Feature: Default

	
	@B31G6-253
		Scenario Outline: Verify filter options are available
		    Given the user logged in as "<userType>"
		    When user clicks on Customers
		    And user clicks on Accounts
		    And user clicks on the filter button
		    Then user should see "Account Name, Contact Name, Contact,Email, Contact Phone, Owner, Business Unit, Created At" filter options
		
		
		    Examples:
		      | userType      |
		      | sales manager |
		      | store manager |