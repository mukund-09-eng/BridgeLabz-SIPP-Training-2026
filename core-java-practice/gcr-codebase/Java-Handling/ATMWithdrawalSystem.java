// Custom Exception
class InsufficientBalanceException extends Exception {

    private double balance;
    private double requestedAmount;

    public InsufficientBalanceException(double balance, double requestedAmount) {
        super("Insufficient Balance");
        this.balance = balance;
        this.requestedAmount = requestedAmount;
    }

    @Override
    public String getMessage() {
        return "Withdrawal Failed!\n" +
               "Available Balance : ₹" + balance + "\n" +
               "Requested Amount  : ₹" + requestedAmount + "\n" +
               "Shortfall Amount  : ₹" + (requestedAmount - balance);
    }
}

// ATM Class
class ATM {

    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;

        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}

// Main Class
public class ATMWithdrawalSystem {

    public static void main(String[] args) {

        ATM atm = new ATM();

        try {

            atm.withdraw(8000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}
