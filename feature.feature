Feature: Tira Order Creation Journey
@Regression @Smoke @Regression 

  Scenario: Successfully creating and canceling an order
    Given I am logged in to the system
    When I create a new order with product '<product_id>', quantity '<quantity>'
    Then I should see the order is created with status 'pending'
    When I decide to cancel this order
    Then I should see the order is canceled with status 'canceled'

  Scenario: Unsuccessful order creation due to invalid product
    Given I am logged in to the system
    When I attempt to create an order with product '9999', quantity '1'
    Then I should see an error message 'Invalid product ID' and status 'error'

  Scenario: Unsuccessful order cancellation due to incorrect order status
    Given I am logged in to the system
    And I have an order with status 'delivered'
    When I attempt to cancel this order
    Then I should see an error message 'Cannot cancel delivered orders' and status 'error'
