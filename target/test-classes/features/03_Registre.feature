Feature: Triton Registration Process Verification

  Background:
    Given I click on the invitation link in the email
    
  Scenario Outline: Verify warning messages for missing data in fields
    When I click on the "<field>" field and without filling data click next field
    Then the application should show the warning message in the user profile step "This field is required."

    Examples:
      | field       |
      | FirstName  |
      | LastName   |
      
	Scenario: Verify warning messages for missing data in field
	When I enter the "QA" and "Test" in the First name and second name fields
	And I click on the next button without filling the data in the company name field
	Then The application should show the Warning message in the company detail steps "This field is required."

	
  Scenario Outline: Verify password validation and mismatch warning
  	When I enter the "QA" and "Test" in the First name and second name fields
  	And I enter the "Brillio" in the company name field 
    And I enter "<password>" in the Password field
    And I enter "<confirm_password>" in the Confirm Password field
    Then the application should show the warning message in the password field "Password and confirm password must match."

    Examples:
      | password  | confirm_password |
      | secret@456 | secret@123        |
      | abc@123   | 123@abc          |

  Scenario: Verify the "Back" button from the Security field
  When I enter the "QA" and "Test" in the First name and second name fields
  	And I enter the "Brillio" in the company name field
    And I enter "password123" in the Password field
    And I enter "password123" in the Confirm Password field
    And I click on the back button
    Then the application should navigate back to the Company profile
    
    
    
    
    
    
    Scenario: Verify the Registration process
    When The user enter the value in the First name and second name fields
  	And The user has to enter the value in the company name field
  	And The user has to  enter the value in the both Password and confirm fields
  	Then The application should show in the final step "The user has been registered successfully"
