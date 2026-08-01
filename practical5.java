package javaapplication1;

import javax.swing.*;
import java.awt.event.*;

public class practical5 extends JFrame implements ActionListener {

  
    JTextField t1, t2, t3;
    JTextArea ta;
    JRadioButton male, female;
    ButtonGroup bg;
    JCheckBox java, python;
    JComboBox<String> edu;
    JButton submit;

    practical5() {

        setTitle("Resume Form");
        setSize(400, 450);
        setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30,30,80,20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(120,30,200,20);
        add(t1);

        JLabel l2 = new JLabel("Email:");
        l2.setBounds(30,70,80,20);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(120,70,200,20);
        add(t2);

        JLabel l3 = new JLabel("Phone:");
        l3.setBounds(30,110,80,20);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(120,110,200,20);
        add(t3);

        JLabel l4 = new JLabel("Address:");
        l4.setBounds(30,150,80,20);
        add(l4);

        ta = new JTextArea();
        ta.setBounds(120,150,200,50);
        add(ta);

        JLabel l5 = new JLabel("Gender:");
        l5.setBounds(30,220,80,20);
        add(l5);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(120,220,70,20);
        female.setBounds(200,220,80,20);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        JLabel l6 = new JLabel("Education:");
        l6.setBounds(30,260,80,20);
        add(l6);

        edu = new JComboBox<>(new String[]{"UG","PG"});
        edu.setBounds(120,260,200,20);
        add(edu);

        JLabel l7 = new JLabel("Skills:");
        l7.setBounds(30,300,80,20);
        add(l7);

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        java.setBounds(120,300,70,20);
        python.setBounds(200,300,80,20);

        add(java);
        add(python);

        submit = new JButton("Submit");
        submit.setBounds(140,350,100,30);
        submit.addActionListener(this);
        add(submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String gender = male.isSelected() ? "Male" : "Female";

        String skills = "";
        if(java.isSelected()) skills += "Java ";
        if(python.isSelected()) skills += "Python";

        JOptionPane.showMessageDialog(this,
                "Name: " + t1.getText() +
                "\nEmail: " + t2.getText() +
                "\nPhone: " + t3.getText() +
                "\nAddress: " + ta.getText() +
                "\nGender: " + gender +
                "\nEducation: " + edu.getSelectedItem() +
                "\nSkills: " + skills);
    }

    public static void main(String[] args) {
        new practical5();
    }
}   

