Feature: Test login ohrm

#@validUsernameAndValidPasswordLogin
Scenario: Test login ohrm for valid username and valid password
#Given I launch chrome "chrome" with URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" 
#(The code is reverse to Hooks.java)
When I enter username in username field as "Admin"
And I enter password in password field as "admin123"
And I click on login button

#@invalidUsernameAndValidPasswordLogin
#Scenario: Test login ohrm for invalid username and valid password
##Given I launch chrome "chrome" with URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" (The code is reverse to Hooks.java)
#When I enter username in username field as "Pro786"
#And I enter password in password field as "admin123"
#And I click on login button
#
#@validUsernameAndinValidPasswordLogin
#Scenario: Test login ohrm for valid username and invalid password
##Given I launch chrome "chrome" with URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" (The code is reverse to Hooks.java)
#When I enter username in username field as "Admin"
#And I enter password in password field as "9088"
#And I click on login button
#
#@invalidUsernameAndinValidPasswordLogin
#Scenario: Test login ohrm for invalid username and invalid password
##Given I launch chrome "chrome" with URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" (The code is reverse to Hooks.java)
#When I enter username in username field as "Pro786"
#And I enter password in password field as "oplijk"
#And I click on login button