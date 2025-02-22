package imt.nordeurope.j2ee.tp.nickler.tp3.servlets;

import imt.nordeurope.j2ee.tp.nickler.tp1.servlets.beans.WeatherBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "JSPMultiLanguageWeather", value = "/JSPMultiLanguageWeather")

public class JSPMultiLanguageWeatherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String language = "default";
        if (request.getParameter("country") != null) {

            String country = request.getParameter("country");
            WeatherBean weatherBean = new WeatherBean();
            switch (country) {
                case "France":
                    weatherBean.setTemperature(10);
                    weatherBean.setCountry("France");
                    weatherBean.setCapital("Paris");
                    language = "fr";
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
                    language = "en";
                    break;
                case "England":
                    weatherBean.setTemperature(10);
                    weatherBean.setCountry("Angleterre");
                    weatherBean.setCapital("Londres");
                    language = "en";
                    break;
                default:
                    weatherBean.setTemperature(0);
                    weatherBean.setCountry("Pas de pays sélectionné");
                    weatherBean.setCapital("Pas de pays sélectionné");
                    break;
            }
            request.setAttribute("weatherBean", weatherBean);
        }

        RequestDispatcher requestDispatcher;

        switch (language) {
            case "fr":
                requestDispatcher = getServletContext().getRequestDispatcher("/Weather-fr.jsp");
                break;
            case "en":
                requestDispatcher = getServletContext().getRequestDispatcher("/Weather-en.jsp");
                break;
            default:
                requestDispatcher = getServletContext().getRequestDispatcher("/Weather-en.jsp");
                break;
        }

        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}