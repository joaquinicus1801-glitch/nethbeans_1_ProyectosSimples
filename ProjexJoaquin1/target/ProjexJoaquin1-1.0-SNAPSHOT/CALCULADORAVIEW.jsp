 <%-- 
    Document   : CALCULADORAVIEW
    Created on : 18 abr. 2026, 7:39:46 a. m.
    Author     : joaqu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> <!<!-- Crea un archivo igual al html, pero se pued escribir codigo java, recuerda -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="CalculadoraController" method="POST"> <!-- determina a que controlador enviar en acction lo ponemos, la etiqueta form devulve envia y devuileve una respuesta?, EN METHOD LO CONRRESPOINDITENT -->
            <h1>Calculadora!</h1>
            <label>primer valor </label> <!-- el label suele describir inputs en los formularios  -->
            <input type="text" name="inValor1"/> <!-- lo inputs son enviados al controlador -->
             <br>
            <label>Segundo valor</label>
            <input type="text" name="inValor2"/>  <!-- type tipo de dato, name es el nombre, se puede repetir a diferencia del id que es como su dni-->
            <br>
            <button type="submit" name="btnOption" value="1">sumar</button>  <!--puedes validar los datros, osea ver si son validos o no con js, lo mismo que con el msm o pokemon-->
            <button type="submit" name="btnOption" value="2">restar</button>  <!--Leera los botones, ejecutar la accion al estar dentro de esto, el controlador recibe la info-->
            <button type="submit" name="btnOption" value="3">multiplicar</button>
            <button type="submit" name="btnOption" value="4">dividir</button> <br>
            <!-- butto: boton que das click, type="sumbit" indica que el boton envia a un formulario, name =".." es el nombre del dato a encviar, el values es el valor que se envia con el name
             name="btnOption" value "1" se convierte en btnOption = 1-->
            <label>resultado: ${sResponse}</label>
            
        </form>

    </body>

</html>
