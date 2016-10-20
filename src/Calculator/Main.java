package Calculator;
import javax.swing.*;
import Calculator.App.*;
import Calculator.UI.*;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Design ui = new Design(calc);
        
        SwingUtilities.invokeLater(ui);
    }
    
}
