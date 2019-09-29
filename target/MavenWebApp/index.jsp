<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h3>
    <%
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            out.println("Wpisz imie");
        } else {
            out.println("Hello " + name + "! :)");
            request.getSession().setAttribute("greeting", "hello " + name + "form session!");
            /*response.addCookie(new Cookie("greeting", "hello " + name + " -form cookie!"));*/
        }
    %>
</h3>
</body>
</html>
