import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyGenericServletTest extends GenericServlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("from init- generic");
    }
    /**
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter out = servletResponse.getWriter();
        out.print("This is from service method - Generic servlet");
        System.out.println(" from service- generic");
    }
    public void destroy() {
        System.out.println("from destroy- generic");
    }
}
