package testpackage;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Calendar;

public class MyTagTestHadler extends TagSupport{
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {

            out.print(num*num*num);
        }catch(Exception e){
            System.out.println(e);
        }
        return SKIP_BODY;
    }
}
