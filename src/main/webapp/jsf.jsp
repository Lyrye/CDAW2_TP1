<%--
  Created by IntelliJ IDEA.
  User: guill
  Date: 29/12/2021
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h:form>
    <h:selectOneListbox value = "#{WeatherBean.country}">
        <f:selectItem itemValue = "France" itemLabel = "France" />
        <f:selectItem itemValue = "Germany" itemLabel = "Allemagne" />
        <f:selectItem itemValue = "USA" itemLabel = "Etats-Unis" />
        <f:selectItem itemValue = "England" itemLabel = "Angleterre" />
    </h:selectOneListbox>
    <h:commandButton type="submit"/>
</h:form>
    <h:graphicImage value="GraphicWeather?country=#{WeatherBean.country}"/>
</body>
</html>
</f:view>