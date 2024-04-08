public class TestCase {
    public static void main(String[] args) {
        // ### Creating the various testing accounts ###
        // BankAccount test objects
        BankAccount testAccount0 = new BankAccount("John", "Doe", 123456, 0.0);

        // CheckingAccount test objects
        CheckingAccount testCheckingAccount0 = new CheckingAccount("John", "Doe", 123456, 0.0, 0.0, 0.0);
        CheckingAccount testCheckingAccount1 = new CheckingAccount("Jason", "Bourne", 123456, 1000.0, 0.01, 35.0);
        CheckingAccount testCheckingAccount2 = new CheckingAccount("James", "Bond", 654321, 2000.0, 0.02, 50.0);

        // ### Testing the BankAccount class ###
        // Test the get methods
        System.out.println("Testing the get methods in the BankAccount class:");
        System.out.println("First Name: " + testAccount0.getFirstName());
        System.out.println("Last Name: " + testAccount0.getLastName());
        System.out.println("Account Number: " + testAccount0.getAccountNumber());
        System.out.println("Balance: " + testAccount0.getBalance());
        System.out.println();

        // Test the accountSummary method
        System.out.println("Testing the accountSummary method in the BankAccount class:");
        System.out.println(testAccount0.accountSummary());
        System.out.println();

        // Test the set methods
        System.out.println("Testing the set methods in the BankAccount class:");
        testAccount0.setFirstName("Jane");
        testAccount0.setLastName("Smith");
        testAccount0.setAccountNumber(654321);
        testAccount0.setBalance(500.0);
        System.out.println(testAccount0.accountSummary());

        // ### Testing the CheckingAccount class ###
        // Test the get methods
        System.out.println("Testing the get methods in the CheckingAccount class:");
        System.out.println("Interest Rate: " + testCheckingAccount0.getInterestRate());
        System.out.println("Overdraft Fee: " + testCheckingAccount0.getOverdraftFee());
        System.out.println();

        // Test the accountSummary method
        System.out.println("Testing the accountSummary method in the CheckingAccount class:");
        System.out.println(testCheckingAccount0.accountSummary());
        System.out.println();

        // Test the set methods
        System.out.println("Testing the set methods in the CheckingAccount class:");
        testCheckingAccount0.setInterestRate(0.01);
        testCheckingAccount0.setOverdraftFee(35.0);
        System.out.println(testCheckingAccount0.accountSummary());
        System.out.println();

        // Test the processWithdrawal method
        System.out.println("Testing the processWithdrawal method in the CheckingAccount class:");
        testCheckingAccount0.processWithdrawal(100.0);
        System.out.println(testCheckingAccount0.accountSummary());
        testCheckingAccount0.processWithdrawal(1000.0);
        System.out.println(testCheckingAccount0.accountSummary());
        System.out.println();

        // Test the processWithdrawal method on testCheckingAccount0
        System.out.println("Testing the processWithdrawal method in the CheckingAccount class:");
        testCheckingAccount0.processWithdrawal(100.0);
        System.out.println(testCheckingAccount0.accountSummary());
        testCheckingAccount0.processWithdrawal(1000.0);
        System.out.println(testCheckingAccount0.accountSummary());
        System.out.println();

        // Test the processWithdrawal method on testCheckingAccount1
        System.out.println("Testing the processWithdrawal method in the CheckingAccount class:");
        testCheckingAccount1.processWithdrawal(100.0);
        System.out.println(testCheckingAccount1.accountSummary());
        testCheckingAccount1.processWithdrawal(1000.0);
        System.out.println(testCheckingAccount1.accountSummary());
        System.out.println();

        // Test the processWithdrawal method on testCheckingAccount2
        System.out.println("Testing the processWithdrawal method in the CheckingAccount class:");
        testCheckingAccount2.processWithdrawal(100.0);
        System.out.println(testCheckingAccount2.accountSummary());
        testCheckingAccount2.processWithdrawal(1000.0);
        System.out.println(testCheckingAccount2.accountSummary());
        System.out.println();
    }
}