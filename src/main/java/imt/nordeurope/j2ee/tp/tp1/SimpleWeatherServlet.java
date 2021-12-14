package imt.nordeurope.j2ee.tp.tp1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleWeatherServlet", value = "/SimpleWeatherServlet")

public class SimpleWeatherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
            response.setContentType("text/html");

        if(request.getParameter("contry")!=null){
            String country = request.getParameter("contry");
            String degree = "";
            String[] isSelected = null;
            String img = "";
            switch(country){
                case "France":
                    degree = "10";
                    isSelected = new String[]{"selected", "", "", ""};
                    break;
                case "Germany":
                    degree = "11";
                    isSelected = new String[]{"", "selected", "", ""};
                    break;
                case "USA":
                    degree = "12";
                    isSelected = new String[]{"", "", "selected", ""};
                    break;
                case "England":
                    degree = "13";
                    isSelected = new String[]{"", "", "", "selected"};
                    break;
                default:
                    break;
            }
            img = "GraphicWeatherServlet?contry="+country;

            writer.println("<body>\n" +
                    "<h1>Température</h1>\n" +
                    "<br/>" +
                    "<form methode='Get' action='SimpleWeatherServlet'>\n" +
                    "        <label for=\"contry-select\">Choose a country:</label>\n" +
                    "        <select name=\"contry\" id=\"contry-select\">\n" +
                    "            <option value=\"\">--Choisisez un pays--</option>\n" +
                    "            <option " + isSelected[0] + " value=\"France\">France</option>\n" +
                    "            <option " + isSelected[1] + " value=\"Germany\">Allemagne</option>\n" +
                    "            <option " + isSelected[2] + " value=\"USA\">USA</option>\n" +
                    "            <option " + isSelected[3] + " value=\"England\">Angleterre</option>\n" +
                    "        </select>\n" +
                    "        <button type=\"submit\">OK</button>\n" +
                    "    </form>"+
                    "<img scr='"+img+"'>"
            );



            writer.println("La température en " + country + " est de : " + degree + " degrés.</body>");
        } else {
            writer.println("<body>\n" +
                    "<h1>Température</h1>\n" +
                    "<br/>" +
                    "<form methode='Get' action='SimpleWeatherServlet'>\n" +
                    "        <label for=\"contry-select\">Choose a country:</label>\n" +
                    "        <select name=\"contry\" id=\"contry-select\">\n" +
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
