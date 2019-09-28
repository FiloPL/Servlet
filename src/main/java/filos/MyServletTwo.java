package filos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/test")
public class MyServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        /**
         * Przekierowania na inne servlety
         */
        // redirect
        resp.sendRedirect(req.getContextPath() + "/secondservlet");

        // forward
        // getServletContext().getRequestDispatcher("/econdservlet").forward(req, resp);

        /**
         * Ciasteczka
         */

        Cookie cookie = new Cookie("ciasteczko", "kcalciastka");
        resp.addCookie(cookie);
        resp.sendRedirect(req.getContextPath() + "/secondservlet");

        for (Cookie cokiesF : req.getCookies()) {
            if (cokiesF.getName().equals("ciasteczko"));     {
                resp.getWriter().println(cokiesF.getValue());
            }
        }


    }
}
