Feature: Document Upload within Project Folder

  Scenario: The User successful Upload Document 
    Given I am on the login page
    When I log in as a client
    And I click on the "Projects" option in the side menu
    And I click on a project
    And I click on the folder section
    When I upload a document
    Then I should see a confirmation popup message indicating successful upload

  Scenario: Attempt Upload of Unsupported Document
    Given I am on the login page
    When I log in as a client
    And I click on the "Projects" option in the side menu
    And I click on a project
    And I click on the folder section
    When I upload an unsupported document
    Then I should see a warning popup message indicating "Unsupported file type"

  Scenario: Attempt Upload of Document Exceeding Size Limit
    Given I am on the login page
    When I log in as a client
    And I click on the "Projects" option in the side menu
    And I click on a project
    And I click on the folder section
    When I upload a document exceeding the file size limit
    Then I should see a warning popup message indicating the reason for failure

    

  
    