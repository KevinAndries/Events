<%-- 
    Document   : index
    Created on : Dec 4, 2016, 1:02:16 PM
    Author     : andri
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
            <form action="ZaalServlet" method="POST">

                <!--<div class="card-panel blue-grey lighten-2">-->
                <nav>
                    <div class="nav-wrapper" >
                        <a href="#!" class="brand-logo"><i class="material-icons">polymer</i>Zaalinformatie</a>
                        <ul class="right hide-on-med-and-down">
                            <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">search</i></a></li>
                           <!--<li><a href="../ProjectEventsWeb/ImagesServlet"><i class="material-icons">view_module</i></a></li>-->
                            <!--<li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">refresh</i></a></li>-->
                            <!--<li><a href="index.jsp"><i class="material-icons">more_vert</i></a></li>-->
                            <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                        </ul>
                    </div>

                </nav>
                <!-- </div>-->




            </form>
            <br>
            <table border="1" class="highlight" class="responsive-table">
                <!--<th>ZaalID</th>
                <th>Overzicht zalen</th>
                <!--<th>Adres</th>
                <th>Huinummer</th>
                <th>Gemeente</th>
                <th>Postcode</th>
                <th>Email</th>
                <th>Kenmerken</th>
                <th>Faciliteiten</th>
                <th>Tarieven</th>
                <th>Capaciteit zittend</th>
                <th>Capaciteit staand</th>
                <th>Oppervlakte</th>
                <th>Profiel</th>-->



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


            <%  // attr ophalen indien geen attr => opgevangen door catch in vorige page
                zaal z = (zaal) request.getAttribute("selectedZaal");
                ArrayList<afbeelding> a = (ArrayList<afbeelding>) request.getAttribute("selectedAfbeelding");

                String tmp = z.getProfiel();
                String path = tmp.substring(0, 1) + tmp.substring(1);


            %>

            <form action="PrijsOfferteServlet" value="conf" name="prijsOfferte" method="post">
                Uw aanvraag voor <%= z.getNaam()%> werd correct ontvangen. 
            </form>






        </div>
    </body>
</html>
