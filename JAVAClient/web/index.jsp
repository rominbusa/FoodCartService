<%-- 
    Document   : index
    Created on : 6 Apr, 2019, 6:56:57 PM
    Author     : Dell-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <%
            RequestDispatcher rd = request.getRequestDispatcher("/ItemList.jsp");
            rd.forward(request, response);
        %>
    </body>
</html>
