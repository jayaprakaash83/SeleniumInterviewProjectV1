Feature: Login

@smoke
Scenario Outline: Login
	Given user opens "chrome" browser
	When user opens "https://vox.sit.omnicore.global/#/"
	And user enters login credentials "<customerID>" "<email>" "<password>"
	Then validate whether page title is "omnio"
	
	Examples:
	| customerID	| email   								| password	|
	| 462054909 	| terry@nextgentestteam.testinator.com	| Tuxedo11 	|
	
@regression
@smoke
Scenario Outline: Login
	Given user opens "edge" browser
	When user opens "https://vox.sit.omnicore.global/#/"
	And user enters login credentials "<customerID>" "<email>" "<password>"
	Then validate whether page title is "abc"
	
	Examples:
	| customerID	| email   								| password	|
	| 475674263 	| jay.jeganathan@omnio.global 			| Tuxedo11	|
	