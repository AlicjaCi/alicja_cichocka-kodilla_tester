package wallet;

public class Cashier {

    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount && amount > 0) {
            cashSlot.dispense(amount);
        } else {
            cashSlot.dispense(0);
        }
    }

}
