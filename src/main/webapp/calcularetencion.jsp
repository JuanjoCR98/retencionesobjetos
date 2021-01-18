<%-- 
    Document   : calcularetencion
    Created on : 18-ene-2021, 20:20:20
    Author     : Juanjo Cortés
--%>

<%@page import="clases.Retencion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String salario = request.getParameter("salario");
            Retencion retencion = new Retencion(salario);
        %>
        <p><b>Salario bruto: </b><%=retencion.getSalario()%> €</p>
        <p><b>Retencion: </b><%=retencion.getRetencion()%> %</p>
        <p><b>Salario neto: </b><%=retencion.getSalarioneto()%>€</p>
    </body>
</html>
