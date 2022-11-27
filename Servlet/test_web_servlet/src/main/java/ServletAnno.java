import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(value = "/testservlet")
public class ServletAnno extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("text output");
        Cookie cookie[] = req.getCookies();
        for(int i =0;i<cookie.length;i++){
            out.println(cookie[i].getName()+" "+cookie[i].getValue());
            if(cookie[i].getName()=="uname"){
                Cookie c = new Cookie("uname","test");
                resp.addCookie(c);
            }else if(cookie[i].getName()=="pwd"){
                Cookie c = new Cookie("pwd","test");
                resp.addCookie(c);
            }
        }
    }
}
