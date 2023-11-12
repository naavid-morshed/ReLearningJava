package JavaSwing.SwingProject;

import javax.swing.*;
import java.awt.*;

class KeyCombinationApp extends JFrame {
    private final JTextField inputField;
    private final StringBuilder enteredKeys;
    private final String[] validCombinations = {"12345", "67890", "54321", "98765"};

    public KeyCombinationApp() {
        setTitle("Key Combination Checker");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        enteredKeys = new StringBuilder();
        inputField = new JTextField(20);
        inputField.setEditable(false);

        // does not work on Mac
        setIconImage(new ImageIcon("./JavaSwing/SwingProject/brac_it.png").getImage());

        JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
        for (int buttonName = 0; buttonName <= 9; buttonName++) {
            addButton(buttonPanel, String.valueOf(buttonName));
        }

        addButton(buttonPanel, "Delete");
        addButton(buttonPanel, "Fingerprint");

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputField, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
    }

    private void addButton(JPanel buttonPanel, String text) {
        JButton button = new JButton(text);
        button.addActionListener(e -> handleButtonClick(text));
        buttonPanel.add(button);
    }

    private void handleButtonClick(String key) {
        if (key.equals("Delete")) {
            if (!enteredKeys.isEmpty()) {
                enteredKeys.deleteCharAt(enteredKeys.length() - 1);
                inputField.setText(enteredKeys.toString());
            }
        } else if (key.equals("Fingerprint")) {
            inputField.setBackground(Color.GREEN);
            inputField.setText("Success");
            enteredKeys.setLength(0); // Clear entered keys for the next attempt
        } else {
            inputField.setBackground(UIManager.getColor("TextField.background"));

            enteredKeys.append(key);
            inputField.setText(enteredKeys.toString());

            for (String combination : validCombinations) {
                if (enteredKeys.toString().equals(combination)) {
                    inputField.setBackground(Color.GREEN);
                    inputField.setText("Success");
                    enteredKeys.setLength(0);
                    break;
                }
            }

            if (enteredKeys.length() == 5) {
                inputField.setBackground(Color.RED);
                inputField.setText("Failure");

                // Clear entered keys for the next attempt
                enteredKeys.setLength(0);
            }
        }
    }
}


public class SProject {
    public static void main(String[] args) {
        new KeyCombinationApp().setVisible(true);
    }
}
