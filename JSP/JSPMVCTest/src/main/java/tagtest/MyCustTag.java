package tagtest;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustTag extends TagSupport {
    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print(new java.util.Date());
        }catch(Exception e){
            System.out.println(e);
        }
        return SKIP_BODY;
    }
}
