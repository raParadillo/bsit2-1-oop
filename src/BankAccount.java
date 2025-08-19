public class BankAccount {
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;

    private static int accountNumberCounter = 1;

    String accountNumber;
    String accountHolderName;
    double balance;

    static String generateAccountNumber() {
        return String.format("ACC%03d", accountNumberCounter++);
    }

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
        totalAccounts++;
        System.out.println("Account Created: " + this.accountNumber + " for " + this.accountHolderName +
                " with initial balance: $" + this.balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(accountHolderName + " has insufficient balance for withdrawal of $" + amount);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}
