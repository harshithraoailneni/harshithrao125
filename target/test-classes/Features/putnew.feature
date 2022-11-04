Feature: User want to update the existing payload

Scenario: User is able to update the payload by using hotelid

Given User will provide the new data in the existing payload
When User Updates the data by using an api is "http://localhost:8080/hotel?id=SATYA_HOTEL_00316"
Then User will also validates the response body that the area is equal to "Jagtial"
And User will also validate the status line is "HTTP/1.1 200 "