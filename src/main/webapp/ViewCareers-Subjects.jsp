<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carreras y Materias</title>
        <%@include file="./libs/Bootstrap.html"%>
        <link href="Styles/Styles.css" rel="stylesheet" type="text/css"/>
        <script src="js/Methods.js"></script>
    </head>
    <body id="background">
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
                    <li class="nav-item">
                        <a class="nav-link" href="./ViewCareers-Subjects.jsp">Carreras & Asignaturas</a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <main>
                        <br>
                        <br>
                        <header>
                            <h1 align="center" style="font-family: Roboto; color: #141c27">
                                Carreras</h1>
                        </header>
                        <br>
                        <br>
                        <center>
                            <section>
                                <button class="button"
                                        data-bs-toggle="modal" 
                                        data-bs-target="#insertCareers">
                                    <span class="button-content">Insertar Carrera
                                    </span>
                                </button>
                            </section>
                        </center>
                    </main>
                    <br>
                    <div class="container" align="center" style="font-family: Roboto">
                        <table
                            id="table"
                            data-locale="es-ES"                    
                            data-url="/college/careers"
                            data-toggle="table"
                            data-filter-control="true"
                            data-show-columns="true">
                            <thead>
                                <tr>
                                    <th data-field="idCareers"><center>ID</center></th>
                            <th data-field="nameCareer"><center>Carrera</center></th>
                            <th data-field="operate" data-formatter="operations" 
                                data-width="222"><center>Acción</center></th>
                            </tr>
                            </thead>
                        </table>  
                    </div>                    
                </div>     
                <div class="col-md-6">
                    <main>
                        <br>
                        <br>
                        <header>
                            <h1 align="center" style="font-family: Roboto; color: #141c27">
                                Asignaturas</h1>
                        </header>
                        <br>
                        <br>
                        <center>
                            <section>
                                <button class="button"
                                        data-bs-toggle="modal" 
                                        data-bs-target="#insertSubjects">
                                    <span class="button-content">Insertar 
                                        Asignatura </span>
                                </button>
                            </section>
                        </center>
                    </main>
                    <br>
                    <div class="container" align="center" style="font-family: Roboto">
                        <table
                            id="table"
                            data-locale="es-ES"                    
                            data-url="/college/subjects"
                            data-toggle="table"
                            data-filter-control="true"
                            data-show-columns="true">
                            <thead>
                                <tr>
                                    <th data-field="idSubjects"><center>ID</center></th>
                            <th data-field="nameSubjects"><center>Asignatura</center></th>
                            <th data-field="operate" data-formatter="operations" 
                                data-width="222"><center>Acción</center></th>
                            </tr>
                            </thead>
                        </table>  
                    </div>
                </div>
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
