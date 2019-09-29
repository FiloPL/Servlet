<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: tzega
  Date: 29.09.2019
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<&
-- Data z jsp
%>
<! -- Data z html -- >
<! --
<%= request.getSession().getAttribute("greeting")%>
<%
    for(Cookie cookie: request.getCookies()) {
        if(cookie.getName().equals("greeting")) {
            out.println("\n" + cookie.getValue());
        }
    }
%>
-->
<%= "Today is: " + new Date()%>

${param.name}

</body>
</html>
