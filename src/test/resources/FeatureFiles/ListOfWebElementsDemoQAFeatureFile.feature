Feature: Test list of web elements

Scenario: count element of click me button

Given I launch chrome "chrome" with URL "https://demoqa.com/alerts" 
Then the total count of click me button is "4"