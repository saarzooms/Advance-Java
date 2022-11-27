import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

public class TestServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("from testservlet get");
//        Cookie c = new Cookie("uname","marwadi");
//        c.setMaxAge(0);
//        resp.addCookie(c);
//        Cookie c1 = new Cookie("pwd","marwadi");
//        resp.addCookie(c1);
//
//        Cookie cookie[] = req.getCookies();
//        for(int i =0;i<cookie.length;i++){
//            out.println(cookie[i].getName()+" "+cookie[i].getValue());
//        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        resp.setIntHeader("Refresh",2);
        PrintWriter out = resp.getWriter();

        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");

        if(uname.equals(pwd)){
//            Cookie c = new Cookie("uname",uname);
//            resp.addCookie(c);
//           out.print("Welcome "+uname);
////           out.print("<form action='dashboard' method='GET' >");
////           out.print("<input type='hidden' name='uname' value='"+uname+"'>");
////           out.print("<input type='submit' name='go' value='go'>");
////           out.print("</form");
//            out.print("<a href='dashboard?uname="+uname+"'>dashboard</a>");
//           out.close();
            HttpSession session = req.getSession();
            session.setAttribute("uname",uname);
            resp.sendRedirect("dashboard");
        }
        else{
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
            out.println("Invalid user name or password");
            dispatcher.include(req,resp);
        }
    }
}