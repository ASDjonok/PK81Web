<%--
  Created by IntelliJ IDEA.
  User: тест
  Date: 05.05.2020
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>

    <%
        Date date = new Date();
        String name = request.getParameter("name");
        if (name != null) {
            out.println("<p>Hello, " + name + "</p>");
        } else {
            out.println("<p>Hello World!</p>");
        }
//        out.print("date2 : " + date.getTime());
    %>

    <%= "<p> Hello! It is first jsp!" + 10/2 + "</p>" %>
    <%= "<p> Date: " + date + "</p>" %>
    <p> Hello! It is first jsp! + 10/2 </p> new Date()
</body>
</html>
