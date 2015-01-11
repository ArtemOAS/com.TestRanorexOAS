Scenario: Delete downloaded user
Given User opens the homepage
When Load users
And Remove downloaded users
Then Users downloaded removed

Scenario: Delete user with using grander female
Given User opens the homepage
When Delete a user with using grander female
Then User with using grander female is delete

Scenario: Delete user with using grander male
Given User opens the homepage
When Delete a user with using grander male
Then User with using grander male is delete

Examples:
|firstName|lastName|
|Peter|Bishop|
|Ivanov|Ivanov|
|Vasy|Beluchy|
|Fox|Malder|