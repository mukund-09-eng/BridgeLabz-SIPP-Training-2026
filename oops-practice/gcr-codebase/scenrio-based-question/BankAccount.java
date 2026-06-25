class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void getStatement() {
        System.out.println("--------------------------");
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder     : " + holder);
        System.out.println("Balance    : " + balance);
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Mukund", 10000);
        BankAccount a2 = new BankAccount(102, "Rahul", 15000);
        BankAccount a3 = new BankAccount(103, "Aman", 20000);
class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void getStatement() {
        System.out.println("--------------------------");
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder     : " + holder);
        System.out.println("Balance    : " + balance);
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Mukund", 10000);
        BankAccount a2 = new BankAccount(102, "Rahul", 15000);
        BankAccount a3 = new BankAccount(103, "Aman", 20000);

        // Account 1 (5 transactions)
        a1.deposit(500);
        a1.withdraw(1000);
        a1.deposit(2000);
        a1.withdraw(3000);
        a1.deposit(1000);

        // Account 2
        a2.deposit(1000);
        a2.withdraw(500);
        a2.deposit(1500);
        a2.withdraw(2000);
        a2.deposit(500);

        // Account 3
        a3.deposit(4000);
        a3.withdraw(1000);
        a3.deposit(3000);
        a3.withdraw(5000);
        a3.deposit(2000);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts Created = " + totalAccounts);
    }
}
