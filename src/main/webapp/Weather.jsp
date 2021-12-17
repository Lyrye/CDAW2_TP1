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
        <option  <% if(request.getParameter("country")==null) out.println("selected");%> value="">--Choisisez un pays--</option>
        <option <% if(request.getParameter("country").equals("France")) out.println("selected");%> value="France">France</option>
        <option <% if (request.getParameter("country").equals("Germany")) out.println("selected");%> value="Germany">Allemagne</option>
        <option <% if(request.getParameter("country").equals("USA")) out.println("selected");%> value="USA">USA</option>
        <option <% if(request.getParameter("country").equals("England")) out.println("selected");%> value="England">Angleterre</option>
    </select>
    <button type="submit">OK</button>
    <br/>
    <h3>TODO</h3>
</form>
</body>
</html>
