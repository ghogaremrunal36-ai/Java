<%@ page import="javax.servlet.http.Cookie" %>

<%
    String username = request.getParameter("username");

    Cookie cookie = new Cookie("username", username);

    cookie.setMaxAge(60 * 60 * 24); // 1 day

    response.addCookie(cookie);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Stored</title>
</head>
<body>

<h2>Cookie Stored Successfully</h2>

<p>User Name: <%= username %></p>

<a href="cookieDisplay.jsp">View Cookie</a>
<br><br>
<a href="index.html">Back to Home</a>

</body>
</html>