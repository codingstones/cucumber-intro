package com.codingstones.bdd.steps;

import com.codingstones.bdd.Calculator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private Calculator calculator;
    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        calculator.sum(arg1, arg2);
    }

    @Then("^the result should be (\\d+)$")
    public void the_result_should_be(int arg1) throws Throwable {
        assertEquals(arg1, calculator.currentValue());
    }

}
