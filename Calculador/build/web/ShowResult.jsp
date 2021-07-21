<%-- 
    Document   : ShowResult
    Created on : Jul 20, 2021, 6:09:31 PM
    Author     : Mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "Calculos.IMC"%>
<%@page import= "Serv.Servlet" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados IMC</title>
    </head>
    <body>
        <h1>Resultados</h1>
        
        <%
            IMC calc = (IMC)request.getAttribute("ResultadoIMC");
        %>
        
        Tu Indice de Masa Corporal es: <b><%=calc.ReturnRes()%></b><br><br>
        
        <a href="index.jsp"><h2>Regresar a Index</h2></a>
        
    </body>
</html>
