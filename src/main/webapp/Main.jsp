<%--
  Created by IntelliJ IDEA.
  User: guill
  Date: 14/12/2021
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
</head>
<body>
    <div id="quote">
        <hr>
        <p>Hello </p>
        <hr/>
    </div>
    <form action="#">
        <input type="text" id="name" value="Stephane">
        <input type="submit" id="replaceContent" value="Refresh local">
        <script type="text/Javascript">
            $(document).ready(function() {
                $("#replaceContent").click(function() {
                    var name = $("#name").val();
                    $.getJSON("AjaxJson?name=" + name,
                        function (data) {
                            console.log(data);
                            var helloWorldData = data.content;
                            $("#quote p").html("<p>" + helloWorldData + "<\/p>");
                        });
                });
            });
        </script>
    </form>

</body>
</html>
