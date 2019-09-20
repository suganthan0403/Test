Feature: Create Account

Scenario: Succsss
Given I want to create an account
When I enter my data
  | name | password|
  | sam | xyux |
  | john | abcd|
  |ram | awer|
Then I verify the account
