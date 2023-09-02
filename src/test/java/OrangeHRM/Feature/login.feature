Feature: validate Login Functionality for OrangeHRM application

Scenario: check the login functionality for valid data
Given user is on the login page of orangeHRM
When user enter username & password
And user click on login button
Then Login should be successful

Feature: validation for student resgistration form

Scenario: check the login functionality for valid data
Given user is on the studentregistrationForm
When user enter Firstname and last name
|Nutan|
|There|
|nutan@gmail.com|
|Female|
|9075850736|
|20 Nov 1998|
|Selenium|
|Sports|
When user click on Choose File button
|C:\Users\NTHERE\Downloads|
|Plot no.81,durga nagar manewada besa road,Nagpur|
|NCR|
And user click on submit button
Then Registration should be successful