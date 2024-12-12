package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzBuzzSteps {
    private int inputNumber;
    private String actualResult;

    @Given("a number {int}")
    public void givenANumber(int number) {
        this.inputNumber = number;
    }

    @When("I check the FizzBuzz result")
    public void whenICheckTheFizzBuzzResult() {
        this.actualResult = FizzBuzzChecker.getResult(inputNumber);
    }

    @Then("the result should be {string}")
    public void thenTheResultShouldBe(String expectedResult) {
        assertEquals(expectedResult, actualResult);
    }
}
