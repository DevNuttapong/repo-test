Feature: Application Login
    @RegTest
    Scenario: Home Page default login
        Given User is on NetBanking landing page
        When User login into application with "jin" and password "1234"
        Then Home page is populated
        And Cards displayed are "true"
    @SmokeTest
    Scenario: Home Page default login
        Given User is on NetBanking landing page
        When User login into application with "john" and password "4321"
        Then Home page is populated
        And Cards displayed are "false"
    @SmokeTest
    Scenario: Home Page default login
        Given User is on NetBanking landing page
        When User login into application with "john" and password "4321"
        Then Home page is populated
        And Cards displayed are "false"
    @RegTest
    Scenario: Home Page default login
        Given User is on NetBanking landing page
        When User sign up with following details
        | jenny | abcd | john@abcd.com | Australia | 3242353 |
        Then Home page is populated
        And Cards displayed are "false"
    @RegTest
    Scenario Outline: Home Page default login
        Given User is on NetBanking landing page
        When User login in to application with <Username> and password <password>
        Then Home page is populated
        And Cards displayed are "true"
        
Examples:
|Username |password |
|user1 | pass1|
|user2 | pass2|
|user3 | pass3|
|user4 | pass4|
