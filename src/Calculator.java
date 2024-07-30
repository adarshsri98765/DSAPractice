import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    public static void main(String[] args) {
        CalculatorFrame();
    }

    private static void CalculatorFrame() {
        JFrame jFrame = new JFrame("ARITHMETIC CALCULATOR");


        //components
        //labels
        JLabel num1=new JLabel("NUMBER:-");
        num1.setBounds(40,40,80,40);
        JLabel num2=new JLabel("NUMBER:-");
        num2.setBounds(180,40,80,40);
        jFrame.add(num1);
        jFrame.add(num2);
        //Text fields
        JTextField num11=new JTextField("");
        num11.setBounds(100,40,60,40);
        JTextField num22=new JTextField("");
        num22.setBounds(240,40,60,40);
        jFrame.add(num11);
        jFrame.add(num22);
        //buttons for arithmetic operations
        JButton addition=new JButton("+");
        addition.setBounds(40,120,120,40);
        JButton subtraction=new JButton("-");
        subtraction.setBounds(200,120,120,40);
        JButton division=new JButton("/");
        division.setBounds(40,180,120,40);
        JButton multiplication=new JButton("*");
        multiplication.setBounds(200,180,120,40);
        JButton result=new JButton("RESULT");
        result.setBounds(120,240,120,40);
        jFrame.add(addition);
        jFrame.add(subtraction);
        jFrame.add(division);
        jFrame.add(multiplication);
        jFrame.add(result);
        //action listener to button can function
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float number1= Float.parseFloat(num11.getText());
                float number2= Float.parseFloat(num22.getText());
                float answer=number1+number2;
                result.setText(String.valueOf(answer));
            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float number1= Float.parseFloat(num11.getText());
                float number2= Float.parseFloat(num22.getText());
                float answer=number1-number2;
                result.setText(String.valueOf(answer));
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float number1= Float.parseFloat(num11.getText());
                float number2= Float.parseFloat(num22.getText());
                float answer=number1/number2;
                result.setText(String.valueOf(answer));
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float number1= Float.parseFloat(num11.getText());
                float number2= Float.parseFloat(num22.getText());
                float answer=number1*number2;
                result.setText(String.valueOf(answer));
            }
        });

        //to use the default layout
        jFrame.setLayout(null);
        jFrame.setSize(400,600);
        jFrame.setVisible(true);
    }


}