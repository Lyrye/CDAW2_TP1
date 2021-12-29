package imt.nordeurope.j2ee.tp.nickler.tp3.servlets;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class TagLibMultiLanguageWeather extends TagSupport {
    public int doStartTag() throws JspException {
        try {
            pageContext.getOut().println("Hello World ! (weather TAG)");
        } catch (IOException e) {
            throw new JspException("I/O Error", e);
        }
        return SKIP_BODY;
    }
}
