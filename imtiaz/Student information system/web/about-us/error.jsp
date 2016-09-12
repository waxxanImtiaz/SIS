<%-- 
    Document   : error
    Created on : Jun 22, 2016, 4:59:56 PM
    Author     : waxxan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sorry! exception occured!</h1>
        <%=exception.getMessage() %>
    </body>
</html>
