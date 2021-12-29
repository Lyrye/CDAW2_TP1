package imt.nordeurope.j2ee.tp.nickler.tp3.tag;

import javax.servlet.jsp.tagext.TagSupport;

public class I18NWeather extends TagSupport {
    private String lang;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
