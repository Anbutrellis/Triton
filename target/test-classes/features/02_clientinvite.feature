Feature: Invite Client

Scenario: Verify the Invite client process with invalid data

Given the user has logged in with Admin credentials.
When the user clicks on the "Invite Client" button.
And the user enters the invalid Email ID of the client.
Then the user verifies the Warning message "Email is not valid"





Scenario: Verify the Invite client process
Given the user has logged in with Admin credentials.

When the user clicks on the "Invite Client" button.

And the user enters the Email ID of the client.

And the user clicks on the "Invite" button.

Then the user verifies whether the client is invited or not.


