import models.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/validateServlet")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users user = new Users();
        user.setUserName(req.getParameter("username"));
        user.setPwd(req.getParameter("password"));
        req.setAttribute("user", user);
        if(user.validate()){
            req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
        }else{
            PrintWriter out = resp.getWriter();
            resp.setContentType("text/html");
            out.print("Invalid user");
            req.getRequestDispatcher("login.jsp").include(req,resp);
        }
    }
}
