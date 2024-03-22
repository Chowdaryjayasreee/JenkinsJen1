
Feature: HotelApp Login
  	
    Scenario Outline: Login Successful
  	Given I am on hotelapp page
  	When user enters the username as <username>
  	And user enters the password as <password>
  	And user clicks on the Login buttom
  	Then user gets login successful message
    Examples: 
      | username   | password  | 
      |"vasuvespag"| "vasu1234"|
      |"Sriyaseth"|"Sriya@86"|
         
