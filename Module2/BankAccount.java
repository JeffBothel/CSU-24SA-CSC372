public class BankAccount {
    // ### Fields for the BankAccount class ###
    private String firstName;
    private String lastName;
    private int accountNumber;
    private double balance;

    // ### Constructors for the BankAccount class ###
    // Default constructor
    public BankAccount() {
        firstName = "";
        lastName = "";
        accountNumber = 0;
        balance = 0.0;
    }

    // Constructor with all parameters
    public BankAccount(String firstName, String lastName, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // ### Methods for gathering info from the BankAccount class ###
    // Get the first name
    public String getFirstName() {
        return firstName;
    }

    // Get the last name
    public String getLastName() {
        return lastName;
    }

    // Get the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Get the balance
    public double getBalance() {
        return balance;
    }

    // Get account information
    public String accountSummary() {
        return "Account Number: " + accountNumber + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Balance: $" + balance;
    }

    // ### Methods for setting info in the BankAccount class ###
    // Set the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Set the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Set the account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Set the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // ### Methods for depositing and withdrawing money from the BankAccount class ###
    // Deposit money
    public void processDeposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    public void processWithdrawal(double amount) {
        balance -= amount;
    }
}
