<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Température</title>
</head>
<body>
<h1>Température</h1>
<br/>
<form action="SimpleWeatherServlet">
    <label for="contry-select">Choose a country:</label>
    <select name="contry" id="contry-select">
        <option value="">--Choisisez un pays--</option>
        <option value="France">France</option>
        <option value="Germany">Allemagne</option>
        <option value="USA">USA</option>
        <option value="England">Angleterre</option>
    </select>
    <button type="submit">OK</button>
</form>
<br/>
<ul>
    <li><a href="/TP1_war/hello-servlet">Hello world</a></li>
    <li><a href="/TP1_war/HelloWorldServlet">Hello world JSP</a></li>
    <li><a href="/TP1_war/GraphicWeatherServlet">Graphic weather</a></li>
    <li><a href="/TP1_war/TagServlet">TAG</a></li>
</ul>

<a href="/TP1_war/SimpleWeatherServlet">Simple Weather</a>
<a href="/TP1_war/JSPWeather">Weather JSP</a>





</body>
</html>
