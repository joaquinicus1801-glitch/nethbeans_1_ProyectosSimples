<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Números Romanos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
            <div class="card p-4 shadow">

                <h2 class="text-center mb-4">CONVERSOR DE NÚMEROS ROMANOS</h2>

                <form action="RomanosController" method="post">

                    <div class="mb-3">
                        <label class="form-label">Número Decimal</label>
                        <input type="number" name="txtNumero" class="form-control" placeholder="Ej: 50">
                        <button class="btn btn-success mt-2 w-100" name="btnOpcion" value="1">
                            Convertir a Romano
                        </button>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Número Romano</label>
                        <input type="text" name="txtRomano" class="form-control" placeholder="Ej: IV">
                        <button class="btn btn-primary mt-2 w-100" name="btnOpcion" value="2">
                            Convertir a Decimal
                        </button>
                    </div>

                </form>

                <h4 class="text-center mt-4">
                    Resultado: ${resultado}
                </h4>

            </div>
        </div>
    </body>
</html>