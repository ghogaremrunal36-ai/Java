<html>
<head>
    <title>Session Value</title>
</head>
<body>

<h2>Session Variable Value</h2>

<%
    String username = (String) session.getAttribute("username");
%>

<p>
    Username stored in session:
    <b><%= username %></b>
</p>

</body>
</html>