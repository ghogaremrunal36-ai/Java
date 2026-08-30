<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jspdb",
            "root",
            "fycs"
        );

        String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, email);

        int result = ps.executeUpdate();

        if (result > 0) {
%>

            <h2>Registration Successful!</h2>

            <p>User <%= username %> has been registered successfully.</p>

            <a href="index.html">Go to Login</a>

<%
        }

        con.close();

    } catch (Exception e) {
%>

        <h3>Database Error:</h3>
        <p><%= e.getMessage() %></p>

<%
    }
%>

</body>
</html>