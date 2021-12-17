<%@ page import="java.util.Objects" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - Température</title>
</head>
<body>
<h1>Température JSP</h1>
<br/>
<form methode='Get' action='JSPWeather'>
    <label for="country-select">Choissisez un pays:</label>
    <select name="country" id="country-select">
        <option ${weatherBean == null ? 'selected' : ''} disabled value="">--Choisisez un pays--</option>
        <option  ${weatherBean.country == "France" ? 'selected' : ''}  value="France">France</option>
        <option ${weatherBean.country == "Allemagne" ? 'selected' : ''} value="Germany">Allemagne</option>
        <option ${weatherBean.country == "Etats-Unis" ? 'selected' : ''} value="USA">Etats-Unis</option>
        <option ${weatherBean.country == "Angleterre" ? 'selected' : ''} value="England">Angleterre</option>
    </select>
    <button type="submit">OK</button>
    <br/>
</form>
<p style="float:left;" ${weatherBean == null ? 'hidden' : ''}>La température à ${weatherBean.capital} en ${weatherBean.country}  est de : ${weatherBean.temperature} degrés.</p>
<div style="clear:both"></div>
<img style="float:left" src="GraphicWeather?country=<%out.println(request.getParameter("country"));%>" ${weatherBean == null ? 'hidden' : ''}>
</body>
</html>
