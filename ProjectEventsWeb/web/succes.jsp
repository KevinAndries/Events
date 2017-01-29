<%-- 
    Document   : Succes
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
                            <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                        </ul>
                    </div>

                </nav>
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


            <%  
                zaal z = (zaal) request.getAttribute("selectedZaal");
                ArrayList<afbeelding> a = (ArrayList<afbeelding>) request.getAttribute("selectedAfbeelding");

                String tmp = z.getProfiel();
                String path = tmp.substring(0, 1) + tmp.substring(1);
            %>


            <form action="PrijsOfferteServlet" value="conf" name="prijsOfferte" method="post">
            <br>
                <div class="row">
                    <div class="col s12 m7">
                        <div class="card">                           
                            <div class="card-content">
                                <font color="black"><p>Uw aanvraag voor <%= z.getNaam()%> werd correct ontvangen. </p></font>
                            </div>
                            <div class="card-action">
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
