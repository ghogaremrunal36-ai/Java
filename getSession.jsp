<html>
<head>
    <title>Get Session</title>
</head>
<body>

<h2>Session Value</h2>

<%
    String username = (String) session.getAttribute("username");
%>

<h3>User Name: <%= username %></h3>

</body>
</html>
