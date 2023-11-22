#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



#Feature: Register Functionality and Confirmation mail
#Scenario: I want to test the Register functionality using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When click on create New Account
#When enter valid First Name
#When enter valid Sur Name
#When Enter valid Email Address
#When click on valid gender
#When Enter valid date of Birth
#When Enter valid password
#When Click on sign up
#When Enter Confirmation code
#When Click On confirm
#When enter a  valid email id


#Feature: Logout Functionality
#Scenario: I want to test the Login functionality and logout using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok 
#When click on logout




Feature: Changing profile name functionality
Scenario: I want to change the profile name using valid credentials
Given open the browser
Given navigate to "https://mbasic.facebook.com" website
When enter a valid email
When enter a valid password
When click on Log in button
When click on ok
When click on settings and privacy
When click on personal and account information
When click on edit
When click on change order of name
When click on radio button
When Enter Saved password 
When Click on save changes



#Feature: login,search friend by name and Sending friend request
#Scenario: I want to test the send friend request using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok
#When click on find friends
#When click on search for friends
#When Enter valid friend name
#When Click on search
#When Enter valid friend name1
#When Click on search1
#When Click on Add friend


#When click on name
#When click on edit profile
#When click on friends 
#When click on delete
#When click on profile


#Feature: accepting friend request
#Scenario: I want to accept friend request using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok
#When Click on Find Friends
#When click on confirm



#Feature: Deleting friend request
#Scenario: I want to delete friend request using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok
#When Click on Find Friends
#When click on delete request




#Feature: Adjusting Privacy settings 
#Scenario: I want to adjust the privacy settings using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok 
#When click on settings and privacy
#When click on profile locking
#When click on See your profile



#Feature: viewing my own and other profiles functionality
#Scenario: I want to view my own and other profiles using valid credentials
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok 
#When click on Edit profile
#When click on find friends
#When enter valid name
#When Click on search
#When click on name



#Feature: liking post functionality
#Scenario: I want to like the post 
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok 
#When Click on like button


#Feature: commenting post functionality
#Scenario: I want to comment the post 
#Given open the browser
#Given navigate to "https://mbasic.facebook.com" website
#When enter a valid email
#When enter a valid password
#When click on Log in button
#When click on ok 
#When Click on comment button
#When Enter some valid text
#When click on comment button1
