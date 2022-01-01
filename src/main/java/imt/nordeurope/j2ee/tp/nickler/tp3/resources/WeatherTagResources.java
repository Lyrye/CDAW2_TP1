package imt.nordeurope.j2ee.tp.nickler.tp3.resources;

import java.util.Collections;
import java.util.Enumeration;
import java.util.ResourceBundle;

public class WeatherTagResources extends ResourceBundle {

    @Override
    protected Object handleGetObject(String key) {
        if (key.equals("SelectLabel")) return "Choose one country";
        if (key.equals("Select")) return "--Choose one country--";
        if (key.equals("France")) return "France";
        if (key.equals("Allemagne")) return "Germany";
        if (key.equals("Etats-Unis")) return "USA";
        if (key.equals("sentencePart1")) return "The temperature at";
        if (key.equals("sentencePart2")) return "in";
        if (key.equals("sentencePart3")) return "is";
        if (key.equals("sentencePart4")) return "degrres";
        return null;
    }

    @Override
    public Enumeration<String> getKeys() {
        return Collections.enumeration(keySet());
    }
}
