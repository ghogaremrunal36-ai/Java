
<html>
<head>
    <title>Display Session</title>
</head>
<body>

<h2>Session Value</h2>

<%
    String username = (String) session.getAttribute("username");

    if (username != null) {
%>

<p>User Name stored in session: <%= username %></p>

<%
    } else {
%>

<p>Session variable not found.</p>

<%
    }
%>

<br>
<a href="index.html">Back to Home</a>

</body>
</html>