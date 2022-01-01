package imt.nordeurope.j2ee.tp.nickler.tp3.resources;

public class WeatherTagResources_en extends WeatherTagResources{
    @Override
    public Object handleGetObject(String key) {
        if (key.equals("SelectLabel")) return "Choose one country";
        if (key.equals("Select")) return "--Choose one country--";
        if (key.equals("France")) return "France";
        if (key.equals("Allemagne")) return "Germany";
        if (key.equals("Etats-Unis")) return "USA";
        if (key.equals("Angleterre")) return "England";
        if (key.equals("sentencePart1")) return "The temperature at";
        if (key.equals("sentencePart2")) return "in";
        if (key.equals("sentencePart3")) return "is";
        if (key.equals("sentencePart4")) return "degrees";
        return null;
    }
}
