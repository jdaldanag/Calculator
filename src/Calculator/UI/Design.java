package Calculator.UI;
import javax.swing.*;
import java.awt.*;
import Calculator.App.*;

public class Design implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    public Design(Calculator calculator){
        this.calc = calculator;
    }
    
    private void createComponents(Container container){
        container.setLayout(new BorderLayout());
        
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3,1));
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,1));
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2,1));
        
        JLabel input1 = new JLabel("Input 1: ");
        JTextField number1 = new JTextField();
        JLabel input2 = new JLabel("Input 2: ");
        JTextField number2 = new JTextField();
        JLabel answer = new JLabel("Answer: ");
        JLabel output = new JLabel("");
        JButton sum = new JButton("+");
        JButton sub = new JButton("-");
        
        Sum actionSum = new Sum(calc,number1,number2,output);
        sum.addActionListener(actionSum);
        
        Sub actionSub = new Sub(calc,number1,number2,output);
        sub.addActionListener(actionSub);
        
        leftPanel.add(input1);
        leftPanel.add(input2);
        leftPanel.add(answer);
        
        centerPanel.add(number1);
        centerPanel.add(number2);
        centerPanel.add(output);
        
        rightPanel.add(sum);
        rightPanel.add(sub);
        
        container.add(leftPanel,BorderLayout.WEST);
        container.add(centerPanel,BorderLayout.CENTER);
        container.add(rightPanel,BorderLayout.EAST);
    }
    
    public void run(){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(200,100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
}
