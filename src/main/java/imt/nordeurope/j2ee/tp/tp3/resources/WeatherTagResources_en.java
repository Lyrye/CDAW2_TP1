package imt.nordeurope.j2ee.tp.tp3.resources;

public class WeatherTagResources_en extends WeatherTagResources{
    @Override
    public Object handleGetObject(String key) {
        if (key.equals("SelectLabel")) return "Choose one country";
        if (key.equals("Select")) return "--Choose one country--";
        if (key.equals("France")) return "France";
        if (key.equals("Allemagne")) return "Germany";
        if (key.equals("Etats-Unis")) return "USA";
        if (key.equals("Angleterre")) return "England";
        return null;
    }
}
