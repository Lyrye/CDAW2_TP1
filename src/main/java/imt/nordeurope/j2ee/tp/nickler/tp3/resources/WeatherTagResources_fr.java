package imt.nordeurope.j2ee.tp.nickler.tp3.resources;

public class WeatherTagResources_fr extends WeatherTagResources{

    @Override
    public Object handleGetObject(String key) {
        if (key.equals("SelectLabel")) return "Choisissez un pays";
        if (key.equals("Select")) return "--Choisissez un pays--";
        if (key.equals("France")) return "France";
        if (key.equals("Allemagne")) return "Allemagne";
        if (key.equals("Etats-Unis")) return "Etats-Unis";
        if (key.equals("Angleterre")) return "Angleterre";
        return null;
    }
}
