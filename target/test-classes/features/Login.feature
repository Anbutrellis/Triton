Feature: Verify the Login Functionality  
	
		Scenario: User login with valid credentials
    Given The User is on the login page
    When The user has to enter valid username and password 
    And The user has to click the login button
    Then The user should be able logged into the account
   
 		Scenario: User login with invalid credentials
    Given The user is on the login page
    When The user has to enter invalid username and password 
    And The user has to click the login button
    Then The user should see an error message indicating invalid credentials
  
    Scenario: User login with invalid password and vaild username
    Given The user is on the login page
    When The user has to enter valid username and Invalid password 
    And The user has to click the login button
    Then The user should see an error message indicating invalid credentials
    
    Scenario:User login with valid password and invaild username
    Given The user is on the login page
    When The user has to enter invalid username and valid password 
    And The user has to click the login button
    Then The user should see an error message indicating invalid credentials


   
    Scenario: User login without any crendentials
    Given The user is on the login page 
    When The user has to click the login button without any crendentials
    Then The user should see an error message indicating these fields are required 
