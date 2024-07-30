import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {
    public static void main(String[] args) {
//        System.out.println("JFrame is used to build GUI in Java");

        JFrame jFrame=new JFrame("BMI Calculator");
        jFrame.setLayout(null);
        jFrame.setSize(400,300);

        JLabel userWeight= new JLabel("Enter weights in Kgs");
        userWeight.setBounds(40,40,150,20);

        JTextField userWeightInput =new JTextField("0");
        userWeightInput.setBounds(200,40,120,20);

        jFrame.add(userWeight);
        jFrame.add(userWeightInput);

        JLabel userHeight= new JLabel("Enter heights in metres");
        userHeight.setBounds(40,70,150,20);

        JTextField userHeightInput =new JTextField("0");
        userHeightInput.setBounds(200,70,120,20);

        jFrame.add(userHeight);
        jFrame.add(userHeightInput);

        JButton calculateBtn = new JButton("Calculate BMI");
        calculateBtn.setBounds(150,100,100,40);
        jFrame.add(calculateBtn);

        JLabel resultLabel=new JLabel("Your BMI is : ");
        resultLabel.setBounds(120,150,120,20);


        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(userWeightInput.getText());
                    double height = Double.parseDouble(userHeightInput.getText());
                    double bmi = weight / (height * height);
                    resultLabel.setText(String.format("BMI: %.2f", bmi));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        jFrame.add(resultLabel);


        jFrame.setVisible(true);
    }
}
