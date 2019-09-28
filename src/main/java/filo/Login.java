package filo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class Login extends HttpServlet {

    static final String USERNAME_KEY = "username";
    static final String PASSWORD_KEY = "password";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("Hello from servlet");

        //resp.getWriter().println(req.getParameter("param"));

        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        if (Validate.checkUser(user, pass)) {
            req.getSession().setAttribute(USERNAME_KEY, user);
            req.getSession().setAttribute(PASSWORD_KEY, pass);
            resp.sendRedirect(req.getContextPath() + "/SOne");
        } else {
            resp.getWriter().println("Podaj login i hasło !");
        }
        //req.getSession().getAttribute("paramFromSession");
    }
}
