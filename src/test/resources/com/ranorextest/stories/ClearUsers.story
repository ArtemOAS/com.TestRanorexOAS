Scenario: Clear the users grander female
Given User opens the homepage
When Adds a user using gender female
And Clear all female users
Then Users female deleted

Scenario: Clear the users grander male
When Adds a user using gender male
And Clear all male users
Then Users with grander male cleaned

Scenario: Clear uploaded Users
When Load users
And Clear all user uploaded
Then All users downloaded cleared

Examples:
|firstName|lastName|
|Peter|Bishop|
|Ivanov|Ivanov|
|Vasy|Beluchy|
|Fox|Malder|