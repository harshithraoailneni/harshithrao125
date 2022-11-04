Feature: User is able to get the data by using area

Scenario: User want to get the data by using area
     
     When User is getting the data by using an api is "http://localhost:8080/hotelall?area=warangal"
     Then User checks the status code is 200
     And User wants to check the content type is "application/json"
