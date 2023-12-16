import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    private JTextField textField;
    private JTextField operandTextField;
    private JLabel resultLabel;

    public CalculatorFrame() {
        // Initialize frame properties (title, size, etc.)
        setTitle("Scientific Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout()); // Use GridBagLayout for more flexibility

        // Create and add components (buttons, text fields, etc.)
        textField = new JTextField();
        operandTextField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        JButton sinButton = new JButton("Sin");
        JButton cosButton = new JButton("Cos");
        JButton tanButton = new JButton("Tan");
        JButton logButton = new JButton("Log");
        JButton log10Button = new JButton("Log10");
        resultLabel = new JLabel("Result: ");

        // Add components to the frame using GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(textField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(operandTextField, gbc);

        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(addButton, gbc);

        gbc.gridx = 1;
        add(subtractButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(multiplyButton, gbc);

        gbc.gridx = 1;
        add(divideButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(sinButton, gbc);

        gbc.gridx = 1;
        add(cosButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(tanButton, gbc);

        gbc.gridx = 1;
        add(logButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(log10Button, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        add(resultLabel, gbc);

        // Action listeners for the buttons
        addButton.addActionListener(new OperationListener("Add"));
        subtractButton.addActionListener(new OperationListener("Subtract"));
        multiplyButton.addActionListener(new OperationListener("Multiply"));
        divideButton.addActionListener(new OperationListener("Divide"));
        sinButton.addActionListener(new OperationListener("Sin"));
        cosButton.addActionListener(new OperationListener("Cos"));
        tanButton.addActionListener(new OperationListener("Tan"));
        logButton.addActionListener(new OperationListener("Log"));
        log10Button.addActionListener(new OperationListener("Log10"));
    }

    private class OperationListener implements ActionListener {
        private String operation;

        public OperationListener(String operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            double operand1 = Double.parseDouble(textField.getText());
            double operand2 = Double.parseDouble(operandTextField.getText());
            double result = performOperation(operand1, operand2, operation);
            resultLabel.setText("Result: " + result);
        }
    }

    private double performOperation(double operand1, double operand2, String operation) {
        switch (operation) {
            case "Add":
                return Calculator.add(operand1, operand2);
            case "Subtract":
                return Calculator.subtract(operand1, operand2);
            case "Multiply":
                return Calculator.multiply(operand1, operand2);
            case "Divide":
                return Calculator.divide(operand1, operand2);
            case "Sin":
                return Calculator.sin(operand1);
            case "Cos":
                return Calculator.cos(operand1);
            case "Tan":
                return Calculator.tan(operand1);
            case "Log":
                return Calculator.log(operand1);
            case "Log10":
                return Calculator.log10(operand1);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
