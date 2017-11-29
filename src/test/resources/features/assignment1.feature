@iOS
Scenario: Logging in
Given user opens IOS application
Then login page should be visible
When user enters valid email and valid password
And user clicks on log in button
Then home page should be visible

@iOS
Scenario: User changes his status
Given user opens IOS application and in logged in
Then home page should be visible
When user opens menu and clicks on status button
And user clicks on busy
Then status should change to busy

@iOS
Scenario: Logging out
Given user opens IOS application and is logged in
Then home page should be visible
When user opens menu
And user clicks on log out button
Then login page should be visible