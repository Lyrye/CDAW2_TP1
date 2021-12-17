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
    <label for="country-select">Choose a country:</label>
    <select name="country" id="country-select">
        <option <% if(request.getParameter("country")==null) out.println("selected");%> disabled value="">--Choisisez un pays--</option>
        <option  ${weatherBean.country == "France" ? 'selected' : ''}  value="France">France</option>
        <option ${weatherBean.country == "Gernamy" ? 'selected' : ''} value="Germany">Allemagne</option>
        <option ${weatherBean.country == "USA" ? 'selected' : ''} value="USA">Etats-Unis</option>
        <option ${weatherBean.country == "England" ? 'selected' : ''} value="England">Angleterre</option>
    </select>
    <button type="submit">OK</button>
    <br/>
    <p style="float:left;" ${weatherBean == null ? 'hidden' : ''}>La température en ${weatherBean.country}  est de : ${weatherBean.temperature} degrés.</p>
</form>
</body>
</html>
