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
<%@ page import="java.util.*" %>
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
            <form action="SearchServletResult" method="POST">

                <!--<div class="card-panel blue-grey lighten-2">-->
                <nav>
                    <div class="nav-wrapper" >
                        <a href="#!" class="brand-logo"><i class="material-icons">polymer</i>Zaalinformatie</a>
                        <ul class="right hide-on-med-and-down">
                            <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">search</i></a></li>
                            <!--<li><a href="../ProjectEventsWeb/ImagesServlet"><i class="material-icons">view_module</i></a></li>-->
                            <li><a href="../ProjectEventsWeb/SearchServlet"><i class="material-icons">refresh</i></a></li>
                            <!-- <li><a href="index.jsp"><i class="material-icons">more_vert</i></a></li>-->
                            <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                        </ul>
                    </div>

                </nav>
                <!-- </div>-->
                <br>
                <br>
                <!--<div class="nav-wrapper">
                    <div class="input-field">
                        <input id="search" type="search">
                        <label for="search"><i class="material-icons">search</i></label>
                        <i class="material-icons">close</i>
                    </div>
                </div>-->



            </form>
            <body>
                <br>
                <br>
                <table class="highlight" class="responsive-table">
                    <thead>
                        <tr>
                            <!--<th data-field="zaalid">ZAALID</th>-->
                            <th data-field="naam">NAAM</th>
                            <th data-field="adres">ADRES</th>
                            <th data-field="huisnummer">HUISNUMMER</th>
                            <th data-field="gemeente">GEMEENTE</th>
                            <th data-field="postcode">POSTCODE</th>
                            <th data-field="email">EMAIL</th>
                            <th data-field="faciliteiten">FACILITEITEN</th>
                            <th data-field="prijs">KENMERKEN</th>
                            <th data-field="tarieven">TARIEVEN</th>
                            <th data-field="capzitend">CAP ZITTEND</th>
                            <th data-field="capstaand">CAP STAAND</th>
                            <th data-field="oppervlakte">OPPERVLAKTE</th>
                        </tr>
                        <%
                            int count = 0;
                            String color = "#F9EBB3";
                            if (request.getAttribute("ziList") != null) {
                                ArrayList al = (ArrayList) request.getAttribute("ziList");
                                System.out.println(al);
                                Iterator itr = al.iterator();
                                while (itr.hasNext()) {

                                    if ((count % 2) == 0) {
                                        color = "#eeffee";
                                    }
                                    count++;
                                    ArrayList zList = (ArrayList) itr.next();
                        %>
                    </thead>

                    <tbody>
                        <tr>
                          <!--<td><%=zList.get(0)%></td>-->
                        <td><%=zList.get(1)%></td>
                        <td><%=zList.get(2)%></td>
                        <td><%=zList.get(3)%></td>
                        <td><%=zList.get(4)%></td>
                        <td><%=zList.get(5)%></td>
                        <td><%=zList.get(6)%></td>
                        <td><%=zList.get(7)%></td>
                        <td><%=zList.get(8)%></td>
                        <td><%=zList.get(9)%></td>
                        <td><%=zList.get(10)%></td>
                        <td><%=zList.get(11)%></td>
                        <td><%=zList.get(12)%></td>
                        </tr>
                        
                        
                                           <%
                            }
                        }
                        if (count == 0) {
                    %>
                    <tr>
                        <td colspan=4 align="center"
                            style="background-color:#eeffee"><b>No Record Found..</b></td>
                    </tr>
                    <%            }
                    %> 
                        

                    </tbody>
                </table>





















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
