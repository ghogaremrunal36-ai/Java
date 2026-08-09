
package practical7;

import java.sql.*;
public class Practical7 {
     public static void main(String[] args) {


          String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String password = "fycs";   

        
        String query = "SELECT * FROM employees";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query)
        ) {

            
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String department = rs.getString("department");

                System.out.println(
                    "ID: " + id +
                    ", Name: " + name +
                    ", Age: " + age +
                    ", Department: " + department
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
}


    
    