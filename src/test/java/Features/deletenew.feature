Feature: User wants to delete the existing data
Scenario: User is able to delete the data by using hotelid

When User wants to delete the data uses an api is "http://localhost:8080/hoteldel?hotelid=SATYA_HOTEL_00602"
Then User will validates the status code is 200
