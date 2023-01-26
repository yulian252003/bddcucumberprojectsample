@search
Feature: Test Free CRM Web Application 

Scenario: Verify Application Landing Page 
	Given User is on Application Landing Page 
	Then Verify user is on Application Landing Page 
	Then User enters the Loggin Area
	Then Verify user is on the Loggin Area
	
Scenario: Application Login 
	Given User is on Application Landing Page 
	Then User enters the Loggin Area
	Then Login FreeCRM Application 
	Then Verify User is on Application Home 
	
Scenario: Create New Contact in Application 
	Given User is on Application Landing Page 
	Then User enters the Loggin Area
	Then Login FreeCRM Application 
	Then Open Contact Page
	Then Create New Contact clicking On Button Plus
	#Then Populate the New Contact Form
	
