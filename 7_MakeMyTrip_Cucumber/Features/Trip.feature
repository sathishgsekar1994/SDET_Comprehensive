Feature: MakeMyTrip
 Scenario: Search ticket
   Given Launch the Browser
   When user opens url: "https://www.makemytrip.com/"
   And Close the notification popup
   And Close the login page
   Then Enter the From city - "HYD"
   Then Enter the To City - "MMA"
   And Enter the depature date
   And Enter the return date
   Then Click search
   Then  Check the page title - "Flights from Hyderabad to Malmo, and back"
   And close Browser