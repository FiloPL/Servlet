package filo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static filo.Login.USERNAME_KEY;

@WebServlet("/SOne")
public class SOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        resp.getWriter().println("servlet2");
        for (Cookie cookie : req.getCookies()) {
            if (cookie.getName().equals("ciasteczko"));     {
                resp.getWriter().println(cookie.getValue());
            }
        }
        resp.getWriter().println(req.getSession().getAttribute("paramFromSession"));
        */
        Object importValue = req.getSession().getAttribute(USERNAME_KEY);

        if(importValue == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
        } else {
            String name = String.valueOf(importValue);
            resp.getWriter().println("Jestes zalogowany "+ importValue);
        }
    }
}
