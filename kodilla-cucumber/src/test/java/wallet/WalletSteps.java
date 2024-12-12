package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private String errorMessage;
    private int balance;

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_in_my_wallet(int amount) {
        wallet.deposit(amount);
        Assertions.assertEquals(amount, wallet.getBalance());
    }

    @Given("there is ${int} in my wallet")
    public void there_is_in_my_wallet(int amount) {
        wallet.deposit(amount);
        Assertions.assertEquals(amount, wallet.getBalance());
    }

    @Given("my wallet is empty")
    public void my_wallet_is_empty() {
        Assertions.assertEquals(0, wallet.getBalance());
    }

    @When("I request ${int}")
    public void i_request(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        if (wallet.getBalance() >= amount && amount > 0) {
            cashier.withdraw(wallet, amount);
            wallet.deposit(-amount);
        } else {
            cashSlot.dispense(0);
        }
    }

    @When("I withdraw ${int}")
    public void i_withdraw(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        if (wallet.getBalance() >= amount && amount > 0) {
            cashier.withdraw(wallet, amount);
            wallet.deposit(-amount);
        } else {
            cashSlot.dispense(0);
            errorMessage = "I don't have enough money in my wallet";
        }
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        balance = wallet.getBalance();
    }

    @Then("${int} should be dispensed")
    public void should_be_dispensed(int amount) {
        Assertions.assertEquals(amount, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be ${int}")
    public void the_balance_of_my_wallet_should_be( int balance) {
        Assertions.assertEquals( balance,  wallet.getBalance());
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_I_dont_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("I don't have enough money in my wallet", errorMessage);
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        Assertions.assertEquals(expectedBalance, balance);
    }
}
