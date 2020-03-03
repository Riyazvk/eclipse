Feature: linkedin Homepage
This feature verifies the functionality on Google Homepage

Scenario: Check that main elements on linkedin Homepage are displayed
Given I launch Chrome browser
When I open Google Homepage
Then I verify sign in page is displayed
Then I verify that username is Entered
Then I verify that password is Entered 
And clicks the submit button