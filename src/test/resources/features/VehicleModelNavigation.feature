@B31G6-229
Feature: Default

	
	@B31G6-226
	Scenario Outline: Vehicles Model Page column's verification for Sales manager and Store Manager
		When the user logged in as "<userType>"
		    When the user navigates to the Vehicles Model page
		    Then the page should display exactly below columns with the following names:
		      | MODEL NAME             |
		      | MAKE                   |
		      | CAN BE REQUESTED       |
		      | CVVI                   |
		      | CO2 FEE (/MONTH)       |
		      | COST (DEPRECIATED)     |
		      | TOTAL COST (DEPRECIATED)|
		      | CO2 EMISSIONS          |
		      | FUEL TYPE              |
		      | VENDORS                |

		Examples:
			| userType     |
			| sales manager |
			| store manager |
	
	@B31G6-228
	Scenario:  Verification that Drivers cannot access the Vehicles Model page.
		Given the user logged in as "driver"
		When the user navigates to Vehicles Model page
		    Then the system should display the message "You do not have permission to perform this action."
