import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameCurrencyConverter {
    public static void main(String[] args) {
//        System.out.println("JFrame is used to build GUI in Java");

        JFrame jFrame=new JFrame("Currency Converter");
        jFrame.setLayout(null);
        jFrame.setSize(400,300);

        JLabel USD= new JLabel("Enter Amount in USD");
        USD.setBounds(40,40,150,20);

        JTextField USDInput =new JTextField("0");
        USDInput.setBounds(200,40,120,20);

        jFrame.add(USD);
        jFrame.add(USDInput);

        JLabel INR= new JLabel("Enter Amount in INR");
        INR.setBounds(40,70,150,20);

        JTextField INRInput =new JTextField("0");
        INRInput.setBounds(200,70,120,20);

        jFrame.add(INR);
        jFrame.add(INRInput);

        JButton calculateBtn = new JButton("Convert");
        calculateBtn.setBounds(150,100,100,40);
        jFrame.add(calculateBtn);

        JLabel resultLabel1=new JLabel();
        JLabel resultLabel2=new JLabel();
        resultLabel1.setBounds(120,150,250,20);
        resultLabel2.setBounds(120,180,250,20);



        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double USD = Double.parseDouble(USDInput.getText());
                    double INR = Double.parseDouble(INRInput.getText());


                    if(USD!=0.0){
                        resultLabel1.setText("Amount in INR is: "+USD*83.73);

//                        String
                        jFrame.add(resultLabel1);
                    }

                    if(INR!=0.0){
                        resultLabel2.setText("Amount in USD is: "+INR*0.012);

                    }

                } catch (NumberFormatException ex) {
                    resultLabel1.setText("Please enter valid numbers.");
                    resultLabel2.setText("Please enter valid numbers.");
                }
            }
        });

//        jFrame.add(resultLabel);
        jFrame.add(resultLabel2);
        jFrame.add(resultLabel1);

        jFrame.setVisible(true);
    }
}
