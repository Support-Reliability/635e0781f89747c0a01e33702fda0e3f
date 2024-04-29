package stepDefinitions;

import io.cucumber.java.en.*;

public class StepDefinitions {

    @Given("I am logged in to the system")
    public void iAmLoggedInToTheSystem() {
        System.out.println("Executing step: I am logged in to the system");
    }

    @When("I create a new order with product '<product_id>', quantity '<quantity>'")
    public void iCreateANewOrderWithProductQuantity(String product_id, String quantity) {
        System.out.println("Executing step: I create a new order with product '<product_id>', quantity '<quantity>'");
    }

    @Then("I should see the order is created with status 'pending'")
    public void iShouldSeeTheOrderIsCreatedWithStatusPending() {
        System.out.println("Executing step: I should see the order is created with status 'pending'");
    }

    @When("I decide to cancel this order")
    public void iDecideToCancelThisOrder() {
        System.out.println("Executing step: I decide to cancel this order");
    }

    @Then("I should see the order is canceled with status 'canceled'")
    public void iShouldSeeTheOrderIsCanceledWithStatusCanceled() {
        System.out.println("Executing step: I should see the order is canceled with status 'canceled'");
    }

    @When("I attempt to create an order with product '9999', quantity '1'")
    public void iAttemptToCreateAnOrderWithProduct9999Quantity1() {
        System.out.println("Executing step: I attempt to create an order with product '9999', quantity '1'");
    }

    @Then("I should see an error message 'Invalid product ID' and status 'error'")
    public void iShouldSeeAnErrorMessageInvalidProductIdAndStatusError() {
        System.out.println("Executing step: I should see an error message 'Invalid product ID' and status 'error'");
    }

    @And("I have an order with status 'delivered'")
    public void iHaveAnOrderWithStatusDelivered() {
        System.out.println("Executing step: I have an order with status 'delivered'");
    }

    @When("I attempt to cancel this order")
    public void iAttemptToCancelThisOrder() {
        System.out.println("Executing step: I attempt to cancel this order");
    }

    @Then("I should see an error message 'Cannot cancel delivered orders' and status 'error'")
    public void iShouldSeeAnErrorMessageCannotCancelDeliveredOrdersAndStatusError() {
        System.out.println("Executing step: I should see an error message 'Cannot cancel delivered orders' and status 'error'");
    }

}
