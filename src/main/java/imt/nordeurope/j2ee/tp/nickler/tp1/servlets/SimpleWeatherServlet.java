package imt.nordeurope.j2ee.tp.nickler.tp1.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "SimpleWeather", value = "/SimpleWeather")

public class SimpleWeatherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
            response.setContentType("text/html");

        if(request.getParameter("country")!=null){
            String country = request.getParameter("country");
            String degree = "";
            String countryLabel = "";
            List<String> isSelected = new ArrayList<>();
            String img = "";
            switch(country){
                case "France":
                    degree = "10";
                    countryLabel = "France";
                    isSelected = Arrays.asList("selected", "", "", "");
                    break;
                case "Germany":
                    degree = "11";
                    countryLabel = "Allemagne";
                    isSelected = Arrays.asList("", "selected", "", "");
                    break;
                case "USA":
                    degree = "12";
                    countryLabel = "USA";
                    isSelected = Arrays.asList("", "", "selected", "");
                    break;
                case "England":
                    degree = "5";
                    countryLabel = "Angleterre";
                    isSelected = Arrays.asList("", "", "", "selected");
                    break;
                default:
                    isSelected = Arrays.asList("", "", "", "");
                    break;
            }
            writer.println("<!DOCTYPE html><html><head>" +
                    "    <title>Hello</title>" +
                    "</head><body>");
            writer.println(
                    "<h1>Température</h1>\n" +
                    "<br/>" +
                    "<form method='get' action='SimpleWeather'>\n" +
                    "        <label for=\"country-select\">Choose a country:</label>\n" +
                    "        <select name=\"country\" id=\"country-select\">\n" +
                    "            <option value=\"\">--Choisisez un pays--</option>\n" +
                    "            <option " + isSelected.get(0) + " value=\"France\">France</option>\n" +
                    "            <option " + isSelected.get(1) + " value=\"Germany\">Allemagne</option>\n" +
                    "            <option " + isSelected.get(2) + " value=\"USA\">USA</option>\n" +
                    "            <option " + isSelected.get(3) + " value=\"England\">Angleterre</option>\n" +
                    "        </select>\n" +
                    "        <button type=\"submit\">OK</button>\n" +
                    "    </form>");
            if(isSelected.contains("selected")){
                img = "GraphicWeather?country="+country;
                writer.println("<p style=\"float:left;\">La température en " + countryLabel + " est de : " + degree + " degrés.</p></body>");
                writer.println("<div style=\"clear:both\"></div>");
                writer.println("<img style=\"float:left;\" src=\""+img+"\">");
            }else {
                writer.println("<p style=\"float:left;\">Sélectionnez un pays pour avoir sa température</p></body>");
            }



        } else {
            writer.println("<!DOCTYPE html><html><head>" +
                    "    <title>Hello</title>" +
                    "</head><body>");
            writer.println(
                    "<h1>Température</h1>\n" +
                    "<br/>" +
                    "<form method='get' action='SimpleWeather'>\n" +
                    "        <label for=\"country-select\">Choose a country:</label>\n" +
                    "        <select name=\"country\" id=\"country-select\">\n" +
                    "            <option value=\"\">--Choisisez un pays--</option>\n" +
                    "            <option  value=\"France\">France</option>\n" +
                    "            <option  value=\"Germany\">Allemagne</option>\n" +
                    "            <option  value=\"USA\">USA</option>\n" +
                    "            <option  value=\"England\">Angleterre</option>\n" +
                    "        </select>\n" +
                    "        <button type=\"submit\">OK</button>\n" +
                    "    </form>"
            );

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
