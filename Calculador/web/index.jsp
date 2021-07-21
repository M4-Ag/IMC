<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Serv.Servlet" %>
<%@page import="Calculos.IMC" %>
<%@page import="java.util.Enumeration"%>

<html>
    <head>
        <title>Calculador</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Indice de Masa Corporal</div>
        
        <form action="Servlet" method="get">
            Nombre: <input type="text" name="nombre" value=""> <br>
            Edad: <input type="number" name="edad" value="" min="15" required> <br>
            Sexo:
            <select name="sexo">
                <option value="Hombre">Hombre</option>
                <option value="Mujer">Mujer</option>
            </select><br>
            Estatura (cm) <input type="number" name="estatura" value="" min="100" max="250" required><br>
            Peso (Kg) <input type="number" name="peso" value="" min="1"><br>
            
            <input type="submit" value="Calcular">
        </form>
        <br><br>
        <b>Ultima sesion de resultados</b><br>
                
                <%
                  Cookie ck[]=request.getCookies();
            if(ck!=null)
            {
                for(int i=0;i<ck.length;i++)
                {
                    if(ck[i].getName().equals("nombre"))
                    {
                        out.println("Nombre: "+ck[i].getValue()+"<br>");
                    }
                    if(ck[i].getName().equals("sexo"))
                    {
                        out.println("Sexo: "+ck[i].getValue()+"<br>");
                    }
                    if(ck[i].getName().equals("estatura"))
                    {
                        out.println("Estatura: "+ck[i].getValue()+"cm<br>");
                    }
                    if(ck[i].getName().equals("peso"))
                    {
                        out.println("Peso: "+ck[i].getValue() + "<br>");
                    }
                    if(ck[i].getName().equals("resultado"))
                    {
                        out.println("Resultado IMC: "+ck[i].getValue() + "<br>");
                    }
                }
            }
                %>
                
    </body>
</html>
