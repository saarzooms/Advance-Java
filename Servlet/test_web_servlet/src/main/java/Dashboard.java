import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/dashboard")
public class Dashboard  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        Cookie c = getCookie(req, "uname");
        PrintWriter out = resp.getWriter();
        String uname = "";
//        if(c!=null)
        HttpSession session = req.getSession(false);
        if(session!=null) {
            uname = (String) session.getAttribute("uname");

            out.println("Welcome " + uname);
            out.println("<a href='logout'>Logout</a>");
        }else{
            out.print("Please login to access this page");
            req.getRequestDispatcher("login.html").include(req,resp);
        }
        out.close();
    }
    public Cookie getCookie(HttpServletRequest req, String name){
        Cookie [] cookies = req.getCookies();
        for(Cookie c: cookies){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
}
