<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP - Température</title>
</head>
<body>
<h1>Température JSP</h1>
<br/>
<form methode='Get' action='SimpleWeather'>
    <label for=\"country-select\">Choose a country:</label>
    <select name=\"country\" id=\"country-select\">
        <option value=\"\">--Choisisez un pays--</option>
        <option value=\"France\">France</option>
        <option  value=\"Germany\">Allemagne</option>
        <option value=\"USA\">USA</option>
        <option value=\"England\">Angleterre</option>
    </select>
    <button type=\"submit\">OK</button>
    <br/>
    <h3>TODO</h3>
</form>
</body>
</html>
