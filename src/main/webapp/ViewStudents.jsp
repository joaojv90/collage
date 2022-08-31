<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estudiantes</title>
        <%@include file="./libs/Bootstrap.html"%>
        <link href="Styles/Styles.css" rel="stylesheet" type="text/css"/>
        <script src="js/Methods.js"></script>
    </head>
    <body id="background">
        <div>
            <%@include file="./libs/Navs.html"%>
        </div>
        <div>
            <main>
                <br>
                <br>
                <header>
                    <h1 align="center">
                        Control para Estudiantes</h1>
                </header>
                <br>
                <br>
                <center>
                    <section>
                        <button class="button"
                                data-bs-toggle="modal" 
                                data-bs-target="#insertStudents">
                            <span class="button-content" style="color: white">Insertar nuevo
                            Estudiante </span>
                        </button>
                    </section>
                </center>
            </main>
            <br>
            <div class="container" align="center" style="font-family: Roboto">
                <table
                    id="table"
                    data-locale="es-ES"                    
                    data-url="/college/students"
                    data-toggle="table"
                    data-filter-control="true"
                    data-height = "500"
                    data-show-columns="true">
                    <thead>
                        <tr>
                            <th data-field="nui"><center>NUI</center></th>
                            <th data-field="firstName"><center>Nombre</center></th>
                            <th data-field="lastName"><center>Apellido</center></th>
                            <th data-field="address"><center>Dirección</center></th>
                            <th data-field="mailAddress"><center>Correo</center></th>
                            <th data-field="phone"><center>Teléfono</center></th>
                            <th data-field="operate" data-formatter="operations" 
                                data-width="222"><center>Acción</center></th>
                        </tr>
                    </thead>
                </table>  
            </div>
        </div>
        <footer>
            <div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            <label>INSTITUTO TÉCNICO SUPERIOR QUITO METROPOLITANO</label>
                        </div>
                        <div class="col-md-6" style="text-align: left">
                            <label>
                                Desarrollado por:   Joao Jaramillo, José Luis Frías y Daniel Parrales
                            </label>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <%@include file="./libs/ModalsStudents.html"%>
    </body>
</html>