Feature: User will retrieve the data by using hotelid
Scenario: User is able to get the data by using hotelid
When User wants to retrieve the data he uses an api is "http://localhost:8080/SATYA_HOTEL_00001/hotel"
Then User will validate the statuscode is 200
And User will also the checks the content type is "application/json"
