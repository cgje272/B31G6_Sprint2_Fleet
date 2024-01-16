@B31G6-247
Feature: Default

	
	@B31G6-245
	Scenario Outline: Verify that Store managers and Sales managers can access the Vehicle  Contracts page.
		When the user logged in as "<userType>"
		When user is on the vehicle contracts page
		Then user should see "All - Vehicle Contract - Entities - System - Car - Entities - System" in the title
		And user should see "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract" in the URL
		    Examples:
		      | userType      |
		      | store manager |
		      | sales manager |	

	
	@B31G6-246
	Scenario Outline: Drivers should NOT be able to access the Vehicle contracts page
		When the user logged in as "<userType>"
		    When user clicks on the vehicle contracts page
		    Then user should see “You do not have permission to perform this action.”
		    Examples:
		      | userType      |
		      | driver |