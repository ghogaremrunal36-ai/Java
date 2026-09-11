<%
    String username = request.getParameter("username");

    session.setAttribute("username", username);

    response.sendRedirect("getSession.jsp");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Session Created</title>
</head>
<body>

<h2>Session Variable Stored Successfully</h2>

<p>
    <a href="getSession.jsp">View Session Variable</a>
</p>

</body>
</html>