package demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mingfei.net@gmail.com
 * 6/12/17 09:03
 * https://github.com/thu/JavaEE_1702/
 */
@WebServlet(urlPatterns = "/user")
public class UserAction extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
        if (action.equals("register")) {
            // TODO: 6/12/17 register
        } else if (action.equals("login")) {
            // TODO: 6/12/17 login
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("logout")) {
            req.getSession().invalidate();
            resp.sendRedirect("index.jsp");
        } else {
        }
    }
}
