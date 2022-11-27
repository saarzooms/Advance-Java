import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyHttpServlet extends HttpServlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("from init - http");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("This is from service method - Http servlet");
        System.out.println(" from service- http");
    }
    @Override
    public void destroy() {
        System.out.println("from destroy- http");
    }
}
