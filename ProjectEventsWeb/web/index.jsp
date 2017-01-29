<%-- 
    Document   : index
    Created on : Dec 4, 2016, 1:02:16 PM
    Author     : Andries Kevin
--%>


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
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        <link type="text/css" rel="stylesheet" href="css/image.css"  media="screen,projection"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zaalzoeker</title>
    </head>
    <body>
        <div class="container">
            <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
            <script type="text/javascript" src="js/materialize.min.js"></script>
            <form action="ZaalServlet" method="POST">

                <nav>
                    <div class="nav-wrapper" >
                        <a href="#!" class="brand-logo"><i class="material-icons">polymer</i>Zaalinformatie</a>
                        <ul class="right hide-on-med-and-down">
                            <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">search</i></a></li>
                            <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">refresh</i></a></li>
                            <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                        </ul>
                    </div>

                </nav>
                <!-- </div>-->




            </form>
            <br>
            <table border="1" class="highlight" class="responsive-table">
                <c:forEach items="${alleZalen}" var="za">
                    <tr>
                        <!--<td>${za.zaalId}</td>-->
                        <td>${za.naam}</td>
                        <!--<td>${za.adres}</td>
                        <td>${za.huisnummer}</td>
                        <td>${za.gemeente}</td>
                        <td>${za.postcode}</td>
                        <td>${za.email}</td>
                        <td>${za.kenmerken}</td>
                        <td>${za.faciliteiten}</td>
                        <td>${za.tarieven}</td>
                        <td>${za.capZittend}</td>
                        <td>${za.capStaand}</td>
                        <td>${za.oppervlakte}</td>-->
                        <td>${za.profiel}</td>

                    </tr>
                </c:forEach>

            </table>


            <div class="slider">
                <ul class="slides">

                    <li>
                        <img src="Images/Profiel/MartinushoeveLongProfiel.jpg"> <!-- random image -->
                        <div class="caption center-align">
                            <h3>Martinushoeve</h3>
                            <h5 class="light grey-text text-lighten-3">Zandvliet</h5>
                        </div>
                    </li>
                    <li>
                        <img src="Images/Profiel/LaSourceLongProfiel.jpg""> <!-- random image -->
                        <div class="caption left-align">
                            <h3>La Source</h3>
                            <h5 class="light grey-text text-lighten-3">Oevel</h5>
                        </div>
                    </li>
                    <li>
                        <img src="Images/Profiel/ParkWestLongProfiel.jpg""> <!-- random image -->
                        <div class="caption right-align">
                            <h3>Park West</h3>
                            <h5 class="light grey-text text-lighten-3">Berchem</h5>
                        </div>
                    </li>
                </ul>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>


                <table border="1" class="highlight" class="responsive-table">
                    <%
                        Object objZalen = request.getSession().getAttribute("zalen");
                        if (objZalen == null) {
                            RequestDispatcher rd = request.getRequestDispatcher("ZaalServlet");
                            rd.forward(request, response);

                        } else {
                            List<zaal> lstZalen = (List<zaal>) objZalen;
                            for (zaal z : lstZalen) {%>

                    <%
                        String tmp = z.getProfiel();
                        String path = tmp.substring(0, 1) + tmp.substring(1);
                    %>
                    <!--<img  class="materialboxed" src = "<%= path%>" />            
                    <a href="../ProjectEventsWeb/OverviewServlet?zaalId=<%= z.getZaalid()%>" ><%= z.getNaam()%></a>
                    <div class="wrap">-->

                    <!-- Define all of the tiles: -->
                    <div class="box">
                        <div class="boxInner">
                            <img href="../ProjectEventsWeb/OverviewServlet?zaalId=<%= z.getZaalid()%>" src="<%= path%>" />
                            <div class="titleBox"><%= z.getNaam()%></div>
                            <br>
                            <a href="../ProjectEventsWeb/OverviewServlet?zaalId=<%= z.getZaalid()%>"> <%= z.getNaam()%> <a/>
                        <div class="titleBox"><%= z.getNaam()%></div>
                        </div>
                    </div>
                    <% }
                            }%>
                    </ul>

                    <%
                        Object objAfbeeldingen = request.getSession().getAttribute("afbeeldingen");
                        if (objAfbeeldingen == null) {
                            RequestDispatcher rd = request.getRequestDispatcher("AfbeeldingServlet");
                            rd.forward(request, response);

                        } else {

                            List<afbeelding> lstAfbeeldingen = (List<afbeelding>) objAfbeeldingen;
                            for (afbeelding a : lstAfbeeldingen) {%>

                    <%
                        String tmp = a.getAfbeelding();
                        String pathPic = tmp.substring(0, 1) + tmp.substring(1);
                    %>

                    <a href="../ProjectEventsWeb/OverviewServlet?zaalId=<%= a.getZaalid()%>" ></a>

                    <% }
                            }%>




                    </ul>
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
