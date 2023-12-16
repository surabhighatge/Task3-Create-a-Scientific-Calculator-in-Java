
// CALCULATOR 
import javax.swing.*;

public class Task2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorFrame calculatorFrame = new CalculatorFrame();
            calculatorFrame.setVisible(true);
        });
    }
}
