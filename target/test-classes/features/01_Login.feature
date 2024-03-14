Feature: Verify the Login Functionality  
  
 		Scenario Outline: User login with invalid credentials
    Given The User is on the login page
    When The user has to enter  "<username>" and  "<password>" 
    And The user has to click the login button
    Then The user should see an error message indicating invalid credentials
    Examples:
    | username                   | password |
    | kanbuselvan@trellissoft.ai | hdagygag |
    | anbuselvan@trellissoft.ai  | Trellis123 |
    |                            |  |
    

	Scenario: User login with valid credentials
    Given The User is on the login page
    When The user has to enter valid username and password 
    And The user has to click the login button
    Then The user should be able logged into the account
   
  