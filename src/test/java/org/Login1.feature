
Feature: Login
 
  Scenario: Success Login
    Given Enter "Sam" and "abcd1"
		When Click on login button
		Then Home Page is displayed
	@sanity
		
		 Scenario: Success Login1
    Given Enter user details
		When Click on login5 button
		Then Home Page is displayed