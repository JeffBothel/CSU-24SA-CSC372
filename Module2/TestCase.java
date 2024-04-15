import java.awt.*;
import javax.swing.*;

public class TestCase extends JFrame {
    public static void main(String[] args) {
        // Create a new CheckingAccount object for testing
        CheckingAccount testAccount = new CheckingAccount();
        testAccount.setFirstName("John");
        testAccount.setLastName("Doe");
        testAccount.setInterestRate(0.07);
        testAccount.setOverdraftFee(35.00);
        System.out.println(testAccount.accountSummary());

        // Creating the account information display
        JFrame mainWindow = new JFrame("Account Information");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 300);

        // Setting up the action frame
        JFrame actionFrame = new JFrame("Account Action");
        actionFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        actionFrame.setSize(400, 300);
        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new BoxLayout(actionPanel, BoxLayout.Y_AXIS));
        JLabel actionLabel = new JLabel("Enter the amount:");
        actionPanel.add(actionLabel);
        JTextField actionField = new JTextField();
        actionField.setPreferredSize(new Dimension(100, 10));
        actionPanel.add(actionField);
        JButton actionWithdraw = new JButton("Withdraw");
        actionWithdraw.addActionListener(e -> {
            testAccount.processWithdrawal(Double.parseDouble(actionField.getText()));
            actionFrame.setVisible(false);
            mainWindow.setVisible(true);
        });
        actionPanel.add(actionWithdraw);
        JButton actionDeposit = new JButton("Deposit");
        actionPanel.add(actionDeposit);
        actionPanel.add(actionWithdraw);
        actionFrame.add(actionPanel);

        // Setting up the main panel information
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JTextPane accountInfo = new JTextPane();
        accountInfo.setText(testAccount.accountSummary());
        mainPanel.add(accountInfo);
        JButton actionButton = new JButton("Account Action");
        actionButton.addActionListener(e -> {
            mainWindow.setVisible(false);
            actionFrame.setVisible(true);
        });
        mainPanel.add(actionButton);

        // Adding the panel to the frame
        mainWindow.add(mainPanel);
        mainWindow.setVisible(true);

    }
}