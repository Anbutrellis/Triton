Feature: Document Upload and Processing

  Background:
    Given I navigate to Triton
    And I login as Client
  Scenario: Verify support document upload and display in Project Library
    When I click on the side menu Project
    And I click on the project Project A
    And I click on the Folder button
    And I click on the Upload button
    And I select document type Support Document
    And I upload the file support_document.pdf
    Then I should see the uploaded document support_document.pdf in the Project Library with type Support Document

  Scenario: Verify Questionnaire document upload, processing, and project completion update
    When I click on the side menu Project
    And I click on the project Project A
    And I click on the Folder button
    And I click on the Upload button
    And I select document type Questionnaire Document
    And I upload the file questionnaire_document.pdf
    Then I should see the uploaded document questionnaire_document.pdf in the Project Library with status Questionnaire (Get AI suggested answers)
    And The Workflow Items should show Upload Questionnaire Documents as checked
    And The project completion percentage should increase by 15%
    And The application should start processing the document with the AI icon blinking

  Scenario: Verify AI icon status after processing
    When I upload the file questionnaire_document.pdf as Questionnaire Document
    And I wait for the processing to complete
    Then The AI icon should stop blinking and turn green
    And The "Scanned by AI" count on the client dashboard should increase
    And The project completion percentage should update accordingly

  Scenario: Verify AI popup functionality
    When I upload the file "questionnaire_document.pdf" as Questionnaire Document
    And I wait for the processing to complete
    And I click on the AI icon
    Then I should see the document "questionnaire_document.pdf" in the popup with a green assured tick and a yellow reprocess icon

  Scenario: Verify notification after document processing
    When I upload the file "questionnaire_document.pdf" as Questionnaire Document
    And I wait for the processing to complete
    And I click on the Notification bell icon
    Then I should see a notification about the processed document

  Scenario: Verify reprocess functionality in AI popup
    When I upload the file "questionnaire_document.pdf" as Questionnaire Document
    And I wait for the processing to complete
    And I click on the AI icon
    And I click on the document name
    And I click on the reprocess button
    Then I should see a confirmation popup with Confirm Reprocess message
    When I click on "No" button
    Then The popup should close and I should be redirected to the project details page
    When I click on "Yes" button
    Then The popup should close and the document should start reprocessing with a timer symbol shown instead of the assured tick and reprocess icon

  Scenario: Verify the processed document page
    When I upload the file questionnaire_document.pdf as "Questionnaire Document"
    And I wait for the processing to complete
    And I click on the AI icon
    And I click on the document name
    Then I should see the document details page with:
      | Name of the questionnaire document |
      | Marked as reviewed button          |
      | Export button                      |
      | Reviewed Questions count           |
      | Total Questions count              |
      | List/Grid toggle                   |
      | All/Reviewed/Pending filters       |
      | Cards for each question            |

  Scenario: Verify error message for empty document upload
    When I upload an empty file "empty_document.pdf" as Questionnaire Document
    Then I should see a warning "Files, Error reading file: ['The uploaded file is empty.']"
