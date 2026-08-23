<%@ page import="javax.servlet.http.Cookie" %>

<%
    String username = request.getParameter("username");

    Cookie cookie = new Cookie("username", username);
    cookie.setMaxAge(60 * 60 * 24);

    response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Store Cookie</title>
</head>
<body>

<h2>Cookie Stored Successfully!</h2>

<p>User Name: <%= username %></p>

<a href="getCookie.jsp">View Cookie</a>
</body>
</html>
