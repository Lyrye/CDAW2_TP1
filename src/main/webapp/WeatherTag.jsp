<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="imt.nordeurope.j2ee.tp.nickler.tp3.tag.I18NWeather" %>
<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>TagLib - Température</title>
</head>
<body>
<h1>Température TagLib</h1>
<br/>
<jsp:useBean id="i18NWeatherBean" beanName="i18NWeatherBean" scope="request" type="imt.nordeurope.j2ee.tp.nickler.tp3.tag.I18NWeather"/>
<%
    Locale currentLocale = new Locale(i18NWeatherBean.getLang());
    ResourceBundle resources = ResourceBundle.getBundle("imt.nordeurope.j2ee.tp.nickler.tp3.resources.WeatherTagResources", currentLocale);
%>

<form method='get' action='TagLibMultiLanguageWeather'>
    <label for="country-select"><%=resources.getString("SelectLabel")%></label>
    <select name="country" id="country-select">
        <option ${weatherBean == null ? 'selected' : ''} disabled value=""><%=resources.getString("Select")%></option>
        <option ${weatherBean.country == "France" ? 'selected' : ''}  value="France"><%=resources.getString("France")%></option>
        <option ${weatherBean.country == "Allemagne" ? 'selected' : ''} value="Germany"><%=resources.getString("Allemagne")%></option>
        <option ${weatherBean.country == "Etats-Unis" ? 'selected' : ''} value="USA"><%=resources.getString("Etats-Unis")%></option>
        <option ${weatherBean.country == "Angleterre" ? 'selected' : ''} value="England"><%=resources.getString("Angleterre")%></option>
    </select>
    <button type="submit">OK</button>
    <br/>
</form>
<p style="float:left;" ${weatherBean == null ? 'hidden' : ''}>La température à ${weatherBean.capital} en ${weatherBean.country}  est de : ${weatherBean.temperature} degrés.</p>
<div style="clear:both"></div>
<img style="float:left" src="GraphicWeather?country=<%out.print(request.getParameter("country"));%>" ${weatherBean == null ? 'hidden' : ''}>
<br/>
<h3>Langues</h3>
<ul>
    <li><a href="TagLibMultiLanguageWeather?lang=fr">FR</a></li>
    <li><a href="TagLibMultiLanguageWeather?lang=en">EN</a></li>
</ul>
</body>
</html>
