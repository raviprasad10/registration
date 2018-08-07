Feature: Registration

Scenario: registering the details
Given user is on Welcome Page
When user clicks on register 
Then register page is opened
When user enters all the details and submit
Then alertbox shows the message
Then project details page is seen
When user gives the proper values
And clicks on submit
Then registration successfull message should be displayed
