<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <title>JSP - Temperature (EN)</title>
</head>
<body>
<h1>JSP - Temperature (EN)</h1>
<br/>
<form methode='Get' action='JSPMultiLanguageWeather'>
    <label for="country-select">Choose one country:</label>
    <select name="country" id="country-select">
        <option ${weatherBean == null ? 'selected' : ''} disabled value="">--Choose one country--</option>
        <option ${weatherBean.country == "France" ? 'selected' : ''}  value="France">France</option>
        <option ${weatherBean.country == "Allemagne" ? 'selected' : ''} value="Germany">Germany</option>
        <option ${weatherBean.country == "Etats-Unis" ? 'selected' : ''} value="USA">USA</option>
        <option ${weatherBean.country == "Angleterre" ? 'selected' : ''} value="England">England</option>
    </select>
    <button type="submit">OK</button>
    <br/>
</form>
<p style="float:left;" ${weatherBean == null ? 'hidden' : ''}>The temperature at ${weatherBean.capital} in ${weatherBean.country}  is : ${weatherBean.temperature} degrees.</p>
<div style="clear:both"></div>
<img style="float:left" src="GraphicWeather?country=<%out.println(request.getParameter("country"));%>" ${weatherBean == null ? 'hidden' : ''}>
</body>
</html>
