<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Introduction</title>
        <%@include file="./libs/Bootstrap.html"%>
        <link href="Styles/Styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body id="background">
        <div>
            <nav class="navbar navbar-expand-sm bg-light" id="barraEncabezado">
                <a class="navbar-brand" href="#">
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
        <div class="container">
            <div class="row">
                <div class="col-md-10">
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <center>
                    <h1 id="title">Introducción</h1>
                    </center>
                    <br>
                    <p align="justify">
                            <b>
                                La aplicación “College” es un sistema de registro y control de estudiantes, profesores,
                                información de las asignaturas y carreras además de datos del ámbito educativo, a 
                                través de una aplicación web. En la aplicación se podrá visualizar la información, 
                                realizar el registro, actualización así como eliminar tanto a estudiantes como de 
                                docentes. Todo esto conectado a una base de datos con procedimientos de almacenamientos, 
                                funciones, triggers y también el control de usuarios y roles.
                            </b> 
                        </p>
                </div> 
                <div>
                    <br>
                    <br>
                    <br>
                    <br>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            <table>
                                <tr>
                                    <td>
                                        <h1 id="title">Objetivo General</h1>
                                        <p align="justify" style="color: #141c27"><b>
                                                • Desarrollar una aplicación WEB con el conocimiento adquirido de 
                                                programación y base de datos usando NETBEANS y MYSQL, tanto en la 
                                                parte de personalización del programa y el desarrollo de código con 
                                                el lenguaje de JAVA, mediante un enfoque teórico/practico, además 
                                                de utilizar lenguajes como HTML, JS y CSS para poder 
                                                realizar la vista del proyecto</b>
                                        </p>
                                    </td>                                 
                                </tr>
                            </table>
                        </div>
                        <div class="col-md-6">
                            <table>
                                <tr>
                                    <td>
                                        <h1 id="title">Obejtivos Específicos</h1>
                                        <p align="justify" style="color: #141c27"><b>
                                            • Describir las características y funciones que nos 
                                            brindan los programas usados en la práctica.<br>
                                            • Conocer y explicar la ejecución del programa, su 
                                            funcionamiento dentro de la web y su respectivo lenguaje 
                                            de código usado en la programación
                                            <br>• Implementar una base datos, con los respectivos 
                                            pasos explicados en clases, para una correcta organización 
                                            del programa al guardar los datos.</b>   
                                        </p>
                                    </td>                                 
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <br>
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
    </body>
</html>
