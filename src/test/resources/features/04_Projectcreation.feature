Feature: Project Creation


Scenario: No Projects Available
     Given I am logged in to the Application
    When I click on the "Projects" option in the side menu
    Then I should see a message indicating "No Records Found"
  

  Scenario: User creates a new project successfully
    Given I am logged in to the Application
    When I navigate to the "Create Project" page
    And I fill in the project details:
    And I click the Create button
    Then I should see a success message confirming the project creation
    And the new project should appear in my project list

  

  Scenario: User cancels project creation
    Given I am logged in to the Application
    When I navigate to the "Create Project" page
    And I click the Cancel button
    Then I should be redirected to the project dashboard
    