<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>All User Records</title>
</head>
<body>

    <h2>All User Records</h2>

    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>Email</th>
        </tr>

<%
    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jspdb",
            "root",
            "fycs"
        );

        String sql = "SELECT * FROM users";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
%>

        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("username") %></td>
            <td><%= rs.getString("password") %></td>
            <td><%= rs.getString("email") %></td>
        </tr>

<%
        }

        con.close();

    } catch (Exception e) {
%>

        <tr>
            <td colspan="4">
                Database Error: <%= e.getMessage() %>
            </td>
        </tr>

<%
    }
%>

    </table>

    <br>

    <a href="index.html">Login</a>
    &nbsp;&nbsp;&nbsp;
    <a href="register.html">Register</a>

</body>
</html>