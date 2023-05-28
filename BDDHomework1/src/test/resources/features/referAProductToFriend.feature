Feature: Refer A Product
  As a register user,I want to refer a product to a friend on DemoNopeCommerce Website
  @referAFriend
  Scenario: Registered user should be able to refer a product to a friend successfully
    Given I am on registration page
    When I enter required registration New details
    And Click on log in button and fill required details
    And Click on selected product
    And Click on email a friend button
    Then I should be able to refer a product by email a friend
