import java.awt.*;
import javax.swing.*;

public class TestCase extends JFrame {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("Panel");
        JPanel mainPanel = new JPanel();
        JLabel mainLabel = new JLabel("Panel Label");
        JButton mainButton = new JButton("Panel Button");

        mainPanel.add(mainLabel);
        mainPanel.add(mainButton);

        mainWindow.setSize(300, 200);
        mainWindow.add(mainPanel);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}