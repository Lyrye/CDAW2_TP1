package imt.nordeurope.j2ee.tp.nickler.tp3.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class I18NWeather extends TagSupport {
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int doStartTag() throws JspException {
        if(this.lang == null){
            this.setLang("en");
        }
        pageContext.getRequest().setAttribute("lang", this.getLang());
        return SKIP_BODY;
    }
}
