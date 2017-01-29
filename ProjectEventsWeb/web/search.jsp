<%-- 
    Document   : index
    Created on : Dec 4, 2016, 1:02:16 PM
    Author     : andri
--%>


<%@page import="java.util.Scanner"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Controller.ZaalServlet"%>
<%@ page import="Controller.AfbeeldingServlet"%>
<%@ page import="DAL.zaal"%>
<%@ page import="DAL.afbeelding"%>
<%@ page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page language="java"%>
<!DOCTYPE html>

<html>
    <head>
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="css/image.css"  media="screen,projection"/>
        <!-- Enable media queries for old IE -->
        <!--[if lt IE 9]>
           <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
        <![endif]-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zaalzoeker</title>
    </head>
    <body>
        <div class="container">
            <!--Import jQuery before materialize.js-->
            <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
            <script type="text/javascript" src="js/materialize.min.js"></script>
            <!--<h1>Zaal informatie</h1>-->
            <form action="SearchServlet" method="POST">

                <!--<div class="card-panel blue-grey lighten-2">-->
                <nav>
                    <div class="nav-wrapper" >
                        <a href="#!" class="brand-logo"><i class="material-icons">polymer</i>Zaalinformatie</a>
                        <ul class="right hide-on-med-and-down">
                            <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">search</i></a></li>
                            <!--<li><a href="../ProjectEventsWeb/ImagesServlet"><i class="material-icons">view_module</i></a></li>-->
                            <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">refresh</i></a></li>
                            <!-- <li><a href="index.jsp"><i class="material-icons">more_vert</i></a></li>-->
                            <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                        </ul>
                    </div>

                </nav>
                <!-- </div>-->
                <br>
                <br>
                <div class="container">
                    <div class="container">
                        <div class="container">
                            <div class="nav-wrapper">

                                <div class="input-field">
                                    <table>
                                        <br>
                                        <br>
                                        <!--<tr>
                                            <td ><b><font color="white">Zaal ID:</font></b>
                                            <td><input  type="text" name="zaalId" id="zaalId"></td>
                                        </tr>-->
                                        <tr>
                                            <td ><b><font size="3" color="white">Naam:</font></b>
                                            <td><input  type="text" name="naam" id="Naam"></td>
                                        </tr>
                                        <tr>
                                            <td ><b><font size="3" color="white">Adres:</font></b></td>
                                            <td><input  type="text" name="adres" id="Adres"></td>
                                        </tr>
                                        <tr>
                                            <td ><b><font size="3" color="white">Gemeente:</font></b></td>
                                            <td><input  type="text" name="gemeente" id="Gemeente"></td>
                                        </tr>
                                        <tr>
                                            <td ><b><font size="3" color="white">Postcode:</font></b></td>
                                            <td><input  type="text" name="postcode" id="Postcode"></td> 
                                        </tr>  
                                        <tr>                                                 
                                            <td ><b><font size="3" color="white">Capaciteit:</font></b></td>
                                            <td><input  type="text" name="capaciteit" id="Capaciteit"></td> 
                                        </tr>  
                                        <tr>                                                    
                                            <td ><b><font size="3" color="white">Tarieven:</font></b></td>
                                            <td><input  type="text" name="tarieven" id="Tarieven"></td> 
                                        </tr>  
                                    </table>

                                    <input class="btn waves-effect waves-light" id="Search" type="submit" value="Search">
                                    <label for="search"><i class="material-icons">search</i></label>

                                </div>
                            </div>
                            <%
                                Scanner sc = new Scanner(System.in);


                            %>


                            </form>
                        </div>
                    </div>
                    <br>
                    <table border="1" class="highlight" class="responsive-table">
                    </table>
                </div>



















                <script src="js/jquery.min.js"></script>
                <script src="js/materialize.min.js"></script>

                <script>
                    $(document).ready(function () {
                        $('.slider').slider();
                        $('.materialboxed').materialbox();
                    });
                    $(function () {
                        // See if this is a touch device
                        if ('ontouchstart' in window)
                        {
                            // Set the correct [touchscreen] body class
                            $('body').removeClass('no-touch').addClass('touch');

                            // Add the touch toggle to show text when tapped
                            $('div.boxInner img').click(function () {
                                $(this).closest('.boxInner').toggleClass('touchFocus');
                            });
                        }
                    });

                </script>
        </div>
    </body>
</html>
