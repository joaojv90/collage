<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Introduction</title>
        <%@include file="./libs/Bootstrap.html"%>
        <link href="Styles/Styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body id="intro">
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
                    <h1>¿Quiénes Somos?</h1>
                    <p align="justify">
                        <b>ORIONSOFT</b> está formado por un equipo humano de jóvenes profesionales con el objetivo de 
                        entregar al mercado, una completa solución, que comprende ingeniería, diseño y desarrollo 
                        de proyectos informáticos, logos profesionales, aplicaciones web, de escritorio y móviles.
                        <br>
                        Sabemos que la tecnología de la información, es una herramienta imprescindible para que 
                        las empresas e instituciones crezcan y produzcan eficientemente su desarrollo profesional. Por esto, 
                        en <b>ORIONSOFT</b> estamos comprometidos con proveer un ambiente de trabajo seguro y colaborativo, así como 
                        también en la calidad de los servicios informáticos que ofrecemos, adaptándonos constantemente a 
                        las necesidades del mercado nacional e internacional.
                        <br>
                        Visita nuestra sección de <a href="./Services.html"><i>servicios</i></a> para saber más.
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
                                        <h1 style="color: white">Objetivo General</h1>
                                        <p align="justify" style="color: white">
                                            • Desarrollar una aplicación WEB con el conocimiento adquirido de 
                                            programación y base de datos usando NETBEANS y MYSQL, tanto en la 
                                            parte de personalización del programa y el desarrollo de código con 
                                            el lenguaje de JAVA, mediante un enfoque teórico/practico, además 
                                            de utilizar lenguajes como HTML, JS y CSS para poder 
                                            realizar la vista del proyecto
                                        </p>
                                    </td>                                 
                                </tr>
                            </table>
                        </div>
                        <div class="col-md-6">
                            <table>
                                <tr>
                                    <td>
                                        <h1 style="color: white">Obejtivos Específicos</h1>
                                        <p align="justify" style="color: white">
                                            • Describir las características y funciones que nos 
                                            brindan los programas usados en la práctica.<br>
                                            • Conocer y explicar la ejecución del programa, su 
                                            funcionamiento dentro de la web y su respectivo lenguaje de código usado en la programación
                                            <br>• Implementar una base datos, con los respectivos 
                                            pasos explicados en clases, para una correcta organización del programa al guardar los datos.    
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
