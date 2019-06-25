
@tag
Feature: Addtariffplan
  

  @tag1
  Scenario Outline:
    Given The user is in telecom home page
    And The user click on add tariffplan
   When The user is filling all the tariff details "<month rent>","<free loc>","<free intt>","<sms pack>","<loc chge>","<inte permin>","<sms per>"
    And The user click on tariff submit button
    Then The user should be displayed congratulation you add Tariff Plan
    
   Examples:
      | month rent  | free loc | free intt |sms pack|loc chge|inte permin|sms per|
      | 100         | 5        | 1        | 1      | 1      | 5        |  1    |       	        
      |101          |6         |2         |2       |2       |2         | 2     |