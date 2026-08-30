<%
    String username = request.getParameter("username");

    session.setAttribute("username", username);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Session Stored</title>
</head>
<body>

<h2>Session Variable Stored Successfully</h2>

<p>User Name: <%= username %></p>

<a href="sessionDisplay.jsp">View Session Value</a>
<br><br>
<a href="index.html">Back to Home</a>

</body>
</html>