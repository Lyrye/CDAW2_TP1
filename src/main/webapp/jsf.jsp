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
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h:form>
    <h:selectOneListbox value = "#{WeatherBean.country}">
        <f:selectItem itemValue = "France" itemLabel = "France" />
        <f:selectItem itemValue = "Germany" itemLabel = "Germany" />
        <f:selectItem itemValue = "USA" itemLabel = "USA" />
        <f:selectItem itemValue = "England" itemLabel = "England" />
    </h:selectOneListbox>
    <h:commandButton type="submit"/>
</h:form>
<h:outputText value="Here is the temperature graphic in "/>
<h:outputText value="#{WeatherBean.country}"/>
<h:outputText value=" at "/>
<h:outputText value="#{WeatherBean.time}"/>
<br>


<h:graphicImage value="GraphicWeather?country=#{WeatherBean.country}"/>
</body>
</html>
</f:view>