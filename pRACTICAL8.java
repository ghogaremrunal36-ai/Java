
package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pRACTICAL8  extends JFrame implements ActionListener {
  JTextField num1, num2, result;
    JButton add, sub, mul, div;

    pRACTICAL8() {
        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel l1 = new JLabel("Enter First Number:");
        JLabel l2 = new JLabel("Enter Second Number:");
        JLabel l3 = new JLabel("Result:");

        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        add(l1);
        add(num1);

        add(l2);
        add(num2);

        add(l3);
        add(result);

        add(add);
        add(sub);

        add(mul);
        add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double ans = 0;

            if (e.getSource() == add) {
                ans = a + b;
            } 
            else if (e.getSource() == sub) {
                ans = a - b;
            } 
            else if (e.getSource() == mul) {
                ans = a * b;
            } 
            else if (e.getSource() == div) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(this,
                            "Cannot divide by zero");
                    return;
                }
                ans = a / b;
            }

            result.setText(String.valueOf(ans));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new pRACTICAL8();
    }   
}
