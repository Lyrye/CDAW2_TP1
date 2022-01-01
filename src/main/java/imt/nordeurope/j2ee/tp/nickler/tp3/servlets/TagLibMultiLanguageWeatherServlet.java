package imt.nordeurope.j2ee.tp.nickler.tp3.servlets;

import imt.nordeurope.j2ee.tp.nickler.tp1.servlets.beans.WeatherBean;
import imt.nordeurope.j2ee.tp.nickler.tp3.tag.I18NWeather;
import imt.nordeurope.j2ee.tp.nickler.tp1.servlets.beans.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TagLibMultiLanguageWeather", value = "/TagLibMultiLanguageWeather")
public class TagLibMultiLanguageWeatherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("country") != null) {

            String country = request.getParameter("country");
            WeatherBean weatherBean = new WeatherBean();
            switch (country) {
                case "France":
                    weatherBean.setTemperature(10);
                    weatherBean.setCountry("France");
                    weatherBean.setCapital("Paris");
                    break;
                case "Germany":
                    weatherBean.setTemperature(8);
                    weatherBean.setCountry("Allemagne");
                    weatherBean.setCapital("Berlin");
                    break;
                case "USA":
                    weatherBean.setTemperature(15);
                    weatherBean.setCountry("Etats-Unis");
                    weatherBean.setCapital("Washington");
                    break;
                case "England":
                    weatherBean.setTemperature(10);
                    weatherBean.setCountry("Angleterre");
                    weatherBean.setCapital("Londres");
                    break;
                default:
                    weatherBean.setTemperature(0);
                    weatherBean.setCountry("Pas de pays sélectionné");
                    weatherBean.setCapital("Pas de pays sélectionné");
                    break;
            }
            request.setAttribute("weatherBean", weatherBean);
        }

        I18NWeather i18NWeatherBean = new I18NWeather();
        String language = "en";
        if (request.getParameter("lang") != null){
            language = request.getParameter("lang");
        }
        request.setAttribute("lang",language);
        i18NWeatherBean.setLang(language);
        request.setAttribute("i18NWeatherBean", i18NWeatherBean);

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/WeatherTag.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
