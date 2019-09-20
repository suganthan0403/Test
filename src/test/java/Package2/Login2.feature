
Feature: Login
 
  Scenario Outline: Success Login
    Given Enter "<name>" in the username field
    And Enter the "<password>" in the pwd  field
		When Click on login button
		Then Home Page is displayed
	
	Examples:
	   | name  | password | 
      | Sam |     abcd1 | 
      | Ram |     abcd2 |