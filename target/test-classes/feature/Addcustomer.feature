@tag
Feature: Addcustomer.feature
  Background:
   Given The user is in telecom page
    And The user click on add Customer  

  @Addcustomer 
  Scenario: Title of your scenario
   
    When The user filling all details
    |test|selenium|test@gmail.com|Chennai|123456|
    And The user click on submit button
    Then The user should be displayed id
    
@Addtarif @Addcustomer
 Scenario: sub
    
    When The user filling all details with manual
    |fname|asar|
    |lname|selenium|
    |asarmca12@gmail.com|
    |address|chennai|
    |phone|9787222786|
    And The user click on submit button
    Then The user should be displayed id
    
   