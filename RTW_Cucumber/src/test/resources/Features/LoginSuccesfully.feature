
Feature: User should be able login succesfully

Scenario Outline:  User should be able to login succesfully  while enters valid username and password 
 Given Open the browser and enter the url
 When User enter the valid <username> and <password>
 And Click on the Login button
 Then User is able to navigate to home Page
 
 Examples:
 |username|password|
 |anubhavchaursiya9145@gmail.com|Anubhav@123|