<%@ page import="javax.servlet.http.Cookie" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Cookies</title>
</head>
<body>

<h2>Cookies Stored on Client</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null && cookies.length > 0) {
%>

<table border="1" cellpadding="10">
    <tr>
        <th>Cookie Name</th>
        <th>Cookie Value</th>
    </tr>

<%
        for (Cookie cookie : cookies) {
%>

    <tr>
        <td><%= cookie.getName() %></td>
        <td><%= cookie.getValue() %></td>
    </tr>

<%
        }
%>

</table>

<%
    } else {
%>

<p>No cookies found.</p>

<%
    }
%>

<br>
<a href="index.html">Back to Home</a>

</body>
</html>