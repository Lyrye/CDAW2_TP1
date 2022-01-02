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
<%@ taglib prefix="i18nWeatherTagLib" uri="WEB-INF/tlds/tp3.tld"%>

<i18nWeatherTagLib:i18nWeather lang='<%=request.getParameter("lang")%>' />

<h3>Langues</h3>
<ul>
    <li><a href="TagLibMultiLanguageWeather?lang=fr">FR</a></li>
    <li><a href="TagLibMultiLanguageWeather?lang=en">EN</a></li>
</ul>
<br/>

<%
    Locale currentLocale = new Locale(request.getAttribute("lang").toString());
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
    <input type="hidden" name ="lang" value="<%=request.getAttribute("lang")%>">
    <button type="submit">OK</button>
    <br/>
</form>
<p style="float:left;" ${weatherBean == null ? 'hidden' : ''}><%=resources.getString("sentencePart1")%> ${weatherBean.capital} <%=resources.getString("sentencePart2")%> ${weatherBean.country} <%=resources.getString("sentencePart3")%> ${weatherBean.temperature}<%=resources.getString("sentencePart4")%></p>
<div style="clear:both"></div>
<img style="float:left" src="GraphicWeather?country=<%out.print(request.getParameter("country"));%>" ${weatherBean == null ? 'hidden' : ''}>

</body>
</html>
