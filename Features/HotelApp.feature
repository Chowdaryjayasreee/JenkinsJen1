Feature: HotelApp Login
  	
    Scenario: Login Successful
  	Given I am on hotelapp page
  	When user enters the username as "shriyaseth"
  	And user enters the password as "Shriya@86"
  	And user clicks on the Login buttom
  	Then user gets login successful message
  	
  