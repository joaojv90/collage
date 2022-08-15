<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Introduction</title>
        <%@include file="./libs/Bootstrap.html"%>
    </head>
    <body>
        <div>
            <nav class="navbar navbar-expand-sm bg-light">
                <a class="navbar-brand" href="#">
                    <img src="img/Logo.png" alt="Logo ITSQMET"
                         style="width:180px;"/>
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
    </body>
</html>
