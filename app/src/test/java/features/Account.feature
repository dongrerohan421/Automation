Feature: Portal login

  Background:
    Given Validate the browser
    When Browser is triggered
    Then Check if browser is started

  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into to application with "Jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into to application with "John" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User signup with following details
      |Jenny|abcd|jenny@gmail.com|Australia|321-239-6987|
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login in to to application with <username> and password <passwd>
    Then Home page is populated
    And Cards displayed are "true"
    Examples:
      | username | passwd |
      | user1    | pass1  |
      | user2    | pass2  |
      | user3    | pass3  |
      | user4    | pass4  |