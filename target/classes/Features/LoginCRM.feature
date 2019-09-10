Feature: Free CRM Login Feature

# Without Example keyword

#Scenario: Free CRM Login Scenario
#
#Given User is present login page
#When Title of login page is CRM
#Then User enters "cthirumalairk@gmail.com" and "vasu12345"
#Then User clicks on login button
#Then User is on Home page

#With Example Keyword
Scenario Outline: Free CRM Login Scenario

Given User is present login page
When Title of login page is CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on Home page

Examples:
	| username | password|
	| cthirumalairk@gmail.com | vasu12345 |
	| abc@gmail.com | test456 |

#Data Tables
Scenario: Free CRM Login Scenario

Given User is present login page
When Title of login page is CRM
Then User enters username and password
|test123 | testpass|
Then User enters firstname and lastname on login button
| thirumalai | Vasan |
Then User is on Home page

	
	
	
# Data TAbles with MAPS

Scenario: Free CRM Login Scenario

Given User is present login page
When Title of login page is CRM
Then User enters username and password
Then User enters firstname and lastname on login button
|FirstName | LastNAme |
| thirumalai | Vasan |
| Ajith | Kumar |
| Bala | Siva |
| VAsu | AK |