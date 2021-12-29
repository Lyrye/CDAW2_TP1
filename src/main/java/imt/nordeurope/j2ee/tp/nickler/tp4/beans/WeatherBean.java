package imt.nordeurope.j2ee.tp.nickler.tp4.beans;

import javax.faces.model.SelectItem;
import java.util.List;

public class WeatherBean {

    private String time;
    private String country = "France";
    private List<SelectItem> countryList;

    public String getTime() {
        return time;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<SelectItem> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<SelectItem> countryList) {
        this.countryList = countryList;
    }
}
