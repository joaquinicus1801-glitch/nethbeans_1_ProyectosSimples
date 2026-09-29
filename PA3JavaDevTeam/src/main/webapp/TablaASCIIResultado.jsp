<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="WEB-INF/Template/HeaderView.jsp"%>
<%@page import="java.util.ArrayList"%>


<%
    ArrayList<Character> listaA
            = (ArrayList<Character>) session.getAttribute("listaA");

    ArrayList<Integer> listaB
            = (ArrayList<Integer>) session.getAttribute("listaB");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Resultado ASCII</title>
    </head>
    <body>

        <h1 align="center">Resultado del Proceso</h1>

        <h2>Lista A - Caracteres</h2>

        <table border="1">

            <tr>
                <th>Posición</th>
                <th>Carácter</th>
            </tr>

            <%
                for (int i = 0; i < listaA.size(); i++) {
            %>

            <tr>
                <td><%= i + 1%></td>
                <td><%= listaA.get(i)%></td>
            </tr>

            <%
                }
            %>

        </table>

        <br><br>

        <h2>Lista B - Códigos ASCII</h2>

        <table border="1">

            <tr>
                <th>Posición</th>
                <th>ASCII</th>
            </tr>

            <%
                for (int i = 0; i < listaB.size(); i++) {
            %>

            <tr>
                <td><%= i + 1%></td>
                <td><%= listaB.get(i)%></td>
            </tr>

            <%
                }
            %>

        </table>

        <br><br>

        <form action="AsciiView.jsp">

            <input type="submit" value="Nuevo Proceso">

        </form>

    </body>
</html>
</div>

<%@include file="WEB-INF/Template/FooterView.jsp"%>
