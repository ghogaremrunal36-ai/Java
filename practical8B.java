package practical7;




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class practical8B extends JFrame implements ActionListener {
     JTextField idField, nameField, courseField, marksField;
    JButton submit, clear;

    // Database details
    String url = "jdbc:mysql://localhost:3306/college";
    String user = "root";
    String password = "fycs";

   practical8B() {

        setTitle("Student Registration Form");
        setSize(450, 350);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel idLabel = new JLabel("Student ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel courseLabel = new JLabel("Course:");
        JLabel marksLabel = new JLabel("Marks:");

        idField = new JTextField();
        nameField = new JTextField();
        courseField = new JTextField();
        marksField = new JTextField();

        submit = new JButton("Submit");
        clear = new JButton("Clear");

        add(idLabel);
        add(idField);

        add(nameLabel);
        add(nameField);

        add(courseLabel);
        add(courseField);

        add(marksLabel);
        add(marksField);

        add(submit);
        add(clear);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String course = courseField.getText();
                int marks = Integer.parseInt(marksField.getText());

                // Connect to database
                Connection con = DriverManager.getConnection(
                        url, user, password);

                // SQL query
                String sql = "INSERT INTO students " +
                             "(id, name, course, marks) VALUES (?, ?, ?, ?)";

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, course);
                pst.setInt(4, marks);

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this,
                        "Record inserted successfully!");

                pst.close();
                con.close();

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this,
                        "ID and Marks must be numbers!");

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(this,
                        "Database Error: " + ex.getMessage());
            }
        }

        else if (e.getSource() == clear) {

            idField.setText("");
            nameField.setText("");
            courseField.setText("");
            marksField.setText("");
        }
    }

    public static void main(String[] args) {
        new practical8B();
    }
}
