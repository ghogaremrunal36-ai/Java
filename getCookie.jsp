<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
    <title>Get Cookie</title>
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

        <h3>User Name: <%= username %></h3>

<%
    } else {
%>

        <h3>Cookie not found.</h3>

<%
    }
%>

</body>
</html>