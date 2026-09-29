

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>AbecedarioView</title>

    <style>

        body{
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        .container{
            width: 500px;
            margin: 80px auto;
            background: white;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px gray;
            text-align: center;
        }

        h1{
            color: #007BFF;
        }

        label{
            font-weight: bold;
        }

        input[type=text]{
            width: 90%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-top: 10px;
        }

        input[type=submit]{
            background: #007BFF;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 15px;
        }

        input[type=submit]:hover{
            background: #0056b3;
        }

        .info{
            margin-top: 15px;
            color: #666;
            font-size: 14px;
        }

    </style>

</head>
<body>

<div class="container">

    <h1>📚 Ejercicio 5 - Abecedario</h1>

    <form action="AbecedarioController" method="post">

        <label>Ingrese una frase:</label>

        <br><br>

        <input type="text"
               name="txtFrase"
               placeholder="Ejemplo: Juan Antonio"
               required>

        <br>

        <input type="submit"
               value="Procesar">

    </form>

    <div class="info">

        Se identificará la posición de cada carácter dentro del abecedario
        considerando mayúsculas y minúsculas.

    </div>

</div>

</body>
</html>
