package filo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static filo.Login.USERNAME_KEY;

@WebServlet("/STwo")
public class STwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object importValue = req.getSession().getAttribute(USERNAME_KEY);

        if(importValue == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
        } else {
            resp.getWriter().println("STwo");
        }

    }
}
