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
    <jsp:useBean id="myUser" class="filo.model.Person"></jsp:useBean>
    <jsp:setProperty name="myUser" property="name" value="Dzik"></jsp:setProperty>
    ${myUser.name}

    <jsp:useBean id="Book" class="filo.model.Book"></jsp:useBean>
    <jsp:setProperty name="Book" property="title" value="Sapkowski"></jsp:setProperty>
    ${Book.title}


</h3>
</body>
</html>
