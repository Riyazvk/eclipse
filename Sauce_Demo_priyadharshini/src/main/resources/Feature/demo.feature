@SauceDemo
Feature: SauceDemo_Website

@TC01_Select_resource_field_in_about_option
Scenario:
Selecting Resource field in about
Given the user launch the chrome application
When the user open the Sauce_demo Home page 
Then The user login the home page
Then Select Articles from resource field
Then close the browser

@TC02_Select_Platform_field_in_about_option
Scenario:
Select Platform field in about
Given the user launching the chrome application
When the user opens the Sauce_demo Home page 
Then user login the home page
Then checking supported browsers in platform field
Then Close the browser

@TC03_select_Solutions_field_in_about_option
Scenario:
Select Solution field in about
Given user launch the chrome application
When user open the Sauce_demo Home page 
Then login the home page
Then checking Live testing option in Solution field
Then closing the browser 

@TC04_select_solutionfield_in_about_option
Scenario:
Select Solution field in about
Given user launching the chrome application
When user opens the Sauce_demo Home page 
Then logins the home page
Then checking Automated testing option in Solution field
Then Closing the browser 