Scenario: Save added users grander female
Given User opens the homepage
When Add user with grander female
And Save added users with grander female
Then Confirm the preservation of added users, grander female

Scenario: Save added users grander male
Given User opens the homepage
When Add user with grander male
And Save added users with grander male
Then Confirm the preservation of added users, grander male

Examples:
|firstName|lastName|
|Peter|Bishop|
|Ivanov|Ivanov|
|Vasy|Beluchy|
|Fox|Malder|

Scenario: Save loaded users
Given User opens the homepage
When Load Users
And Save uploaded by users
Then Confirm saving uploaded by users

