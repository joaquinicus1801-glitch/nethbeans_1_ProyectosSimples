<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
    <style>
        body {
            font-family: Arial;
            background: #f4f4f4;
            text-align: center;
        }
        .container {
            background: white;
            padding: 20px;
            margin: 50px auto;
            width: 400px;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }
        h2 {
            color: #007BFF;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>🧾 Resultado de la Compra</h2>

    <%
        String rango = (String) request.getAttribute("rango");
        Integer cantidad = (Integer) request.getAttribute("cantidad");
        Double precio = (Double) request.getAttribute("precio");
        Double descuento = (Double) request.getAttribute("descuento");
        Double total = (Double) request.getAttribute("total");
    %>

    <% if (rango != null) { %>

        <p><strong>Rango de edad:</strong> <%= rango %></p>
        <p><strong>Cantidad:</strong> <%= cantidad %></p>
        <p><strong>Precio por entrada:</strong> S/. <%= precio %></p>
        <p><strong>Descuento aplicado:</strong> <%= descuento %>%</p>
        <h3>Total a pagar: S/. <%= total %></h3>

    <% } else { %>

        <p>No hay datos para mostrar.</p>

    <% } %>

    <br>
    <a href="index.html">Nueva compra</a>

</div>

</body>
</html>