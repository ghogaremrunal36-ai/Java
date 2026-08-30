<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
    <title>Display Cookie</title>
</head>
<body>

<h2>Cookie Value</h2>

<%
    Cookie[] cookies = request.getCookies();
    String username = null;

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                username = cookie.getValue();
                break;
            }
        }
    }

    if (username != null) {
%>

<p>User Name stored in cookie: <%= username %></p>

<%
    } else {
%>

<p>Cookie not found.</p>

<%
    }
%>

<br>
<a href="index.html">Back to Home</a>

</body>
</html>