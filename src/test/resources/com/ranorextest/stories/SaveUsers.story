Scenario: Save added users grander female
Given User opens the homepage
When Add user with grander female
And Save added users with grander female
Then Confirm the preservation of added users, grander female

Scenario: Save added users grander male
When Add user with grander male
And Save added users with grander male
Then Confirm the preservation of added users, grander male

Scenario: Save loaded users
When Load Users
And Save uploaded by users
Then Confirm saving uploaded by users

Examples:
|firstName|lastName|
|Peter|Bishop|
|Ivanov|Ivanov|
|Vasy|Beluchy|
|Fox|Malder|