public class CheckingAccount extends BankAccount {
    // ### Fields for the CheckingAccount class. This extends from BankAccount. ###
    private double interestRate;
    private double overdraftFee;

    // ### Constructors for the CheckingAccount class ###
    // Default constructor
    public CheckingAccount() {
        super();
        interestRate = 0.0;
        overdraftFee = 0.0;
    }

    // Constructor with all parameters
    public CheckingAccount(String firstName, String lastName, int accountNumber, double balance, double interestRate, double overdraftFee) {
        super(firstName, lastName, accountNumber, balance);
        this.interestRate = interestRate;
        this.overdraftFee = overdraftFee;
    }

    // ### Methods for gathering info from the CheckingAccount class ###
    // Get the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Get the overdraft fee
    public double getOverdraftFee() {
        return overdraftFee;
    }

    // Get account information
    public String accountSummary() {
        return super.accountSummary() + "\n" +
                "Interest Rate: " + interestRate + "\n" +
                "Overdraft Fee: " + overdraftFee;
    }

    // ### Methods for setting info in the CheckingAccount class ###
    // Set the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Set the overdraft fee
    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    // ### Methods for manipulating the CheckingAccount class ###
    // Withdraw money from the account
    public void processWithdrawal(double amount) {
        super.processWithdrawal(amount);
        if (getBalance() < 0) {
            super.processWithdrawal(overdraftFee);
        }
    }
}
