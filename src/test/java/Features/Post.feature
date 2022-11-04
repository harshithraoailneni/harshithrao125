Feature: User is able to post the data in the database
Scenario: User wants to create or post the data

Given User wants to provide the data
When User posts the data by using the api is "http://localhost:8080/hotel"
Then User checks the Status code is 200
