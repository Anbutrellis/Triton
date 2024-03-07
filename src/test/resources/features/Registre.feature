Feature: Triton Registration Process Verification

  Background:
    Given I click on the invitation link in the email

  Scenario Outline: Verify the "First name" and "Last name" fields with valid and invalid data
    When I click on the "<field>" field
    And I enter "<valid_data>" in the field
    Then the application should allow only specified characters for valid data
    And the application should not allow the specified characters for invalid data

    Examples:
      | field      | valid_data | invalid_data |
      | First Name | John123    | John@123     |
      | Last Name  | Doe456     | Doe@456      |
      | First Name | Alice2021  | Alice#2021   |
      | Last Name  | MarySmith  | Mary$Smith   |
      | First Name | BobSmith   | Bob$mith     |
      | Last Name  | Johnson    | Johnson#     |

  Scenario Outline: Verify warning messages for missing data in fields
    When I click on the "<field>" field
    And I click on another field
    Then the application should show the warning message "This field is required"

    Examples:
      | field       |
      | First Name  |
      | Last Name   |
      | Email       |

  Scenario Outline: Verify password validation and mismatch warning
    When I enter "<password>" in the Password field
    And I enter "<confirm_password>" in the Confirm Password field
    Then the application should show the warning message "Password and confirm password must match."

    Examples:
      | password  | confirm_password |
      | pass123   | pass123          |
      | secret456 | secret123        |
      | abc@123   | 123@abc          |

  Scenario: Verify the "Back" button from the Security field
    When I enter "password123" in the Password field
    And I enter "password123" in the Confirm Password field
    And I click on the Password field
    And I click on the back button
    Then the application should navigate back to the Company profile
