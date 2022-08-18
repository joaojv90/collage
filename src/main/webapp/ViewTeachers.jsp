<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profesores</title>
        <%@include file="./libs/Bootstrap.html"%>
        <link href="Styles/Styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-sm bg-light" id="barraEncabezado">
                <a class="navbar-brand" href="./Introduction.jsp">
                    <img src="img/Logo.png" alt="Logo ITSQMET"
                         style="width:120px;"/>
                </a>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="./ViewStudents.jsp">Estudiantes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./ViewTeachers.jsp">Profesores</a>
                    </li>
                </ul>
            </nav>
        </div>
        <footer>
            <div style="background-color: #EBF5FB">
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
    </body>
</html>