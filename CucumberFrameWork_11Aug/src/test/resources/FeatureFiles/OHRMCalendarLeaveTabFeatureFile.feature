Feature: Test Calendar on leave tab on Orange HRM

Scenario: Test Calendar

Given I launch chrome "chrome" with URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When I enter username in username field as "Admin"
And I enter password in password field as "admin123"
And I click on login button
When I navigate to "Leave" Tab

Scenario Outline: Test Calendar Value
And I click on element "<element>"
And I select Month "<month>"
And I select Year "<year>"
#And I select Date "26"

Examples:
|element  |month |year|
|From Date|August|2021|
|To Date  |August|2023|
