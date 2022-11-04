Feature: User is able to delete the existing data

Scenario: user wants to delete the data from an api


When User delete the data by using an api "http://localhost:8080/hoteldel?hotelid=SATYA_HOTEL_00603"
Then User  checks the status code is 200
