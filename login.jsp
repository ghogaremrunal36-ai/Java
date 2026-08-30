<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Login Result</title>
</head>
<body>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jspdb",
            "root",
            "fycs"
        );

        String sql = "SELECT * FROM users WHERE username=? AND password=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
%>

            <h2>Login Successful</h2>
            <p>Welcome, <%= username %>!</p>

<%
        } else {
%>

            <h2>Invalid Username or Password</h2>
            <a href="index.html">Try Again</a>

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