Scenario: Disable the confirmation for the connection to the database
Given User opens the homepage
When That would disconnect from the database, click to disconnect
And That would connect from the database, click to connect
And Disable the confirmation for the connection to the database
Then Database connection offline

Scenario: Confirm the connection to the database
When That would connect from the database, click to connect
And Confirm the connection to the database
Then Database connection successfully

Scenario: Disconnect from the database
When That would connect from the database, click to connect
When Disconnect from the database
Then Connection has been disconnected from the database

