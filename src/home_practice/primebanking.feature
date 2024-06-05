Feature:  Functionality of Banking application
  As a user I want to check core functionality

  Background: I am on Primebanking site
    Given :   I am on primebanking Url "www.primebanking.com"
    When :    I am able to see primeBanking homepage
    Then :    I am able to see Manager and customer tab

  Scenario: I am able to Login with valid emailid and password in Manager tab
    When :  User enter emailId "Shital@primebanking.com
    And :   User enter password "Shital@123
    And :   User click on login
    Then :  User can login successfully

  Scenario Outline : User should not register with invalid credentials in manager tab
    Given             User is on registration page
    When              User enter "<Firstname >" in firstname field
    And               User enter "<Lastname>" in lastname field
    And               User enter "<Emailaddress>" in email address filed
    And               User enter "<Password>" in password field
    And               User enter "<ConfirmPassword>" in confirm password field
    And               User click on Registration button
    Then              User  should not register
    Examples:
      | Firstname | Lastname | Emailaddress         | Password | ConfirmPassword |
      |           | Sanghani | Abc@Primebanking.com | 123456   | 123456          |
      | Shital    |          | Abc@Primebanking.com | 123456   | 123456          |
      | Shital    | Sanghani |                      | 123456   | 123456          |
      | Shital    | Sanghani | Abc@Primebanking.com |          | 123456          |
      | Shital    | Sanghani | Abc@Primebanking.com | 123456   |                 |
      |           |          |                      |          |                 |

  Scenario: I am able to Login with valid emailid and password in Customer tab
    When :  User enter emailId "Shital@gmail.com
    And :   User enter password "Shital@12323
    And :   User click on login
    Then :  User can login successfully

  Scenario Outline : User should not register with invalid credentials in customer
    Given             User is on registration page
    When              User enter "<Firstname >" in firstname field
    And               User enter "<Lastname>" in lastname field
    And               User enter "<Emailaddress>" in email address filed
    And               User enter "<Password>" in password field
    And               User enter "<ConfirmPassword>" in confirm password field
    And               User click on Registration button
    Then              User  should not register
    Examples:
      | Firstname | Lastname | Emailaddress  | Password | ConfirmPassword |
      |           | Sanghani | Abc@gmail.com | 123456   | 123456          |
      | Shital    |          | Abc@gmail.com | 123456   | 123456          |
      | Shital    | Sanghani |               | 123456   | 123456          |
      | Shital    | Sanghani | Abc@gmail.com |          | 123456          |
      | Shital    | Sanghani | Abc@gmail.com | 123456   |                 |
      |           |          |               |          |                 |

  Scenario: User able to see Balance inquiry tab
    When :  User logged in to Manager account with valid emailId and Password
    And :   USer add three customer id for verification 12345,234543,455646 under shital sanghani
    And :   USer add another three account to different manager id 12345,23456,3467 under Manini
    And :   A manager can view balance of all the customers who come under his supervision
    Then :  User able to see all the account balances

  Scenario Outline : User should able to transfer with valid credentials in  Fund Transfer tab
    Given             User is on Fund Transfer Tab
    When              User enter "<Firstname >" in firstname field
    And               User enter "<Lastname>" in lastname field
    And               User enter "<Bank Name>" in bankname filed
    And               User enter "<Branch Name>" in Branch name field
    And               User enter "<Account Number>" in Account Number field
    And               User enter "<IBN No>" in confirm ibn field
    And               User enter "<Transfer Date>" in Transfer Date field
    And               User enter "<country>" in country field
    And               User enter "<City>" in City field
    And               User enter "<Currency>" in Currency field
    And               User enter "<Amount>" in Amount field
    And               User enter "<Exchange Rate>" in Exchange Rate field
    And               User click on Registration button
    Then             A manager can transfer funds from any source bank account to destination account

    Examples:
      | Firstname | Lastname | Bank Name | Branch Name | Account Number | IBN No   | Transfer Date | country | City    | Currency | Amount | Exchange Rate |
      | Manini    | Sheth    | Halifax   | Harrow      | 13485785787345 | IB23123  | 05/06/2024    | USA     | newyork | Dollar   | 1200   | 90.p          |
      | Chetan    | Patel    | lloyds    | Wembley     | 12345678907655 | IB657657 | 08/07/2024    | India   | Surat   | INR      | 1500   | 100           |
      | Ramya     | Shiva    | HSBC      | Rugby       | 12345567789987 | IBN2373  | 21/07/2024    | UK      | Rugby   | GBP      | 1300   | 100           |
      | Bhavesh   | Jani     | BOB       | Baroda      | 12345678934332 | IBN12345 | 06/06/2025    | India   | Delhi   | INR      | 500    | 90            |
