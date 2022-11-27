import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

//create servlet using servlet interface
public class MyServletInterfaceTest implements Servlet {
    /**
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("from init");
    }

    /**
     * @return
     */
    public ServletConfig getServletConfig() {
        System.out.println("from getServletConfig");
        return null;
    }

    /**
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter out = servletResponse.getWriter();
        out.print("This is from service method");
        System.out.println(" from service");
    }

    /**
     * @return
     */
    public String getServletInfo() {
        System.out.println("From getServletInfo");
        return null;
    }

    /**
     *
     */
    public void destroy() {
        System.out.println("from destroy");
    }
}
