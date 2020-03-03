@linkedin_Feature
Feature: linkedin website

@tc01_linkedin_login 
Scenario: 
	To check the linkedin login
	
	Given the user launched the chrome browser 
    When the user opens linkedin login page
	Then verify the user name and password
	Then to verify signin 

@tc02_linkedin_join 
Scenario: 
	To check the linkedin join
	
	Given launch the chrome browser 
	When the user opens linkedin join page
	Then verify the user id and password
	Then to verify joinin 
	