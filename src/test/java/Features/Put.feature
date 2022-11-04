Feature: User is able to update the data by performing put action

Scenario: User wants to update the data 

Given User wants to update the existing the data
When user put the data using an api "http://localhost:8080/hotel?id=SATYA_HOTEL_00317"
Then User checks the status code is 200 or not
And User also checks the contentType
And User will also validate the response body whether hotelid is equal to "SATYA_HOTEL_00317"