package Calculator.UI;
import java.awt.event.*;
import javax.swing.*;
import Calculator.App.*;

public class Sub implements ActionListener {
    private Calculator calc;
    private JTextField number1;
    private JTextField number2;
    private JLabel result;
    
    public Sub(Calculator calc,JTextField num1,JTextField num2,JLabel result){
        this.calc = calc;
        this.number1 = num1;
        this.number2 = num2;
        this.result = result;
    }
    
    public void actionPerformed(ActionEvent ae){
        try {
            this.calc.sub(Double.parseDouble(number1.getText()),Double.parseDouble(number2.getText()));
            this.result.setText("" + calc.getResult());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Numbers not found! ","NumberFormatException",JOptionPane.ERROR_MESSAGE);
        }
    }
}
