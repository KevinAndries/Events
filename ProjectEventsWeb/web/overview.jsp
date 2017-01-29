<%-- 
    Document   : overview
    Created on : Dec 13, 2016, 1:16:52 PM
    Author     : andri
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAL.zaal"%>
<%@page import="DAL.afbeelding"%>
<%@page import="ViewModel.Zaal"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="css/grid.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="css/image.css"  media="screen,projection"/>
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
        <form action="./ZaalServlet" method="POST">

            <!--<div class="card-panel blue-grey lighten-2">-->
            <nav>
                <div class="nav-wrapper" >
                    <a href="#!" class="brand-logo"><i class="material-icons">polymer</i>Overzicht zalen</a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">search</i></a></li>
                        <!--<li><a href="../ProjectEventsWeb/ImagesServlet"><i class="material-icons">view_module</i></a></li>-->
                        <li><a href="../ProjectEventsWeb/OverviewServlet"><i class="material-icons">refresh</i></a></li>
                        <!--<li><a href="index.jsp"><i class="material-icons">more_vert</i></a></li>-->
                        <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                    </ul>
                </div>

            </nav>
        </form>
    </div>

    <br>

    <!--<div class="container">
        <div class="slider">
            <ul class="slides">
                <li>
                    <img src="http://lorempixel.com/580/250/nature/1"> <!-- random image
                    <div class="caption center-align">
                        <h3>This is our big Tagline!</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <img src="http://lorempixel.com/580/250/nature/2"> <!-- random image
                    <div class="caption left-align">
                        <h3>Left Aligned Caption</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <img src="http://lorempixel.com/580/250/nature/3"> <!-- random image
                    <div class="caption right-align">
                        <h3>Right Aligned Caption</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
                <li>
                    <img src="http://lorempixel.com/580/250/nature/4"> <!-- random image
                    <div class="caption center-align">
                        <h3>This is our big Tagline!</h3>
                        <h5 class="light grey-text text-lighten-3">Here's our small slogan.</h5>
                    </div>
                </li>
            </ul>
        </div>
    </div>-->

    <br>
    <br>


    <div class="itemWrapper">
        <div id="infoPageWrapper" class="center-align">

            <%  // attr ophalen indien geen attr => opgevangen door catch in vorige page
                zaal z = (zaal) request.getAttribute("selectedZaal");
                ArrayList<afbeelding> a = (ArrayList<afbeelding>) request.getAttribute("selectedAfbeelding");

                String tmp = z.getProfiel();
                String path = tmp.substring(0, 1) + tmp.substring(1);


            %>




            <img id="selectedZaal" src="<%= path%>">

            <br>
            <br>
            <br>
            <br>
            <form action="AanvraagPrijsOfferteServlet" value="conf" name="aanvraagPrijsOfferte" method="POST">
                <div class="left-align">
                    <div class="container">
                        <ul class="collapsible popout" data-collapsible="accordion">
                            <li>
                                <div class="collapsible-header"><i class="material-icons">person_pin</i>Contactgegevens</div>
                                <div class="collapsible-body"><p>Naam: <%= z.getNaam()%></p>
                                    <p>Adres: <%= z.getAdres() + " " + z.getHuisnummer()%></p>
                                    <p>Gemeente: <%= z.getPostcode() + " - " + z.getGemeente()%></p>
                                    <p>email: <%= z.getEmail()%></p></div>
                            </li>
                            <li>
                                <div class="collapsible-header"><i class="material-icons">star</i>Kenmerken</div>
                                <div class="collapsible-body"><p><%= z.getKenmerken()%></p></div>
                            </li>
                            <li>
                                <div class="collapsible-header"><i class="material-icons">stars</i>Faciliteiten</div>
                                <div class="collapsible-body"><p><%= z.getFaciliteiten()%></p></div>
                            </li>
                            <li>
                                <div class="collapsible-header"><i class="material-icons">info</i>Capactiteit</div>
                                <div class="collapsible-body"><p>Capaciteit zittend: <%= z.getCapzittend()%></p>
                                    <p>Capaciteit staand: <%= z.getCapstaand()%></p>
                                    <p>Oppervlakte: <%= z.getOppervlakte()%></p>
                            </li>
                            <li>
                                <div class="collapsible-header"><i class="material-icons">shopping_basket</i>Tarief</div>
                                <div class="collapsible-body"><p>Tarief: <%= z.getTarieven()%></p></div>
               
                            </li>
                            <li>
                                <div class="collapsible-header" ><i class="material-icons">picture_in_picture</i>Afbeeldingen</div>
                                <div class="collapsible-body"><p>
                                        <%
                                           // String[] selectedAfbeelding = {"Interieur", "Tuin", "Extra", "Extra2"};
                                        %>
                                        <c:forEach var="afbeelding" varStatus="loop" items="${selectedAfbeelding}" >
                                            <img src="${afbeelding.afbeelding}"> 
                                            <!--<a onclick="getafbeeldingIndex(${loop.index})" href="#">${afbeelding.afbeelding}</a>-->
                                        </c:forEach>
                                    </p></div>
                            </li>
                        </ul>
                        <button class="btn waves-effect waves-light">
                            <a href="../ProjectEventsWeb/AanvraagPrijsOfferteServlet?zaalId=<%= z.getZaalid()%>">Aanvraag Offerte<a/>
                        </button>              
                    </div>




                </div>
            </form>


            <!--<form action="prijsOfferte.jsp">-->

            <%
                Object objZalen = request.getSession().getAttribute("zalen");
                if (objZalen == null) {
                    RequestDispatcher rd = request.getRequestDispatcher("AanvraagPrijsOfferteServlet");
                    rd.forward(request, response);

                } else {
                    List<zaal> lstZalen = (List<zaal>) objZalen;
                    for (zaal zp : lstZalen) {%>
            <br>

            <%  %>
            <% }
                }%>

                <%
                    Object objAfbeeldingen = request.getSession().getAttribute("afbeeldingen");
                    if (objAfbeeldingen == null) {
                        RequestDispatcher rd = request.getRequestDispatcher("AanvraagPrijsOfferteServlet");
                        rd.forward(request, response);

                    } else {

                        List<afbeelding> lstAfbeeldingen = (List<afbeelding>) objAfbeeldingen;
                        for (afbeelding ap : lstAfbeeldingen) {%> 


                <%

                %>

                <a href="../ProjectEventsWeb/AanvraagPrijsOfferteServlet?zaalId=<%= ap.getZaalid()%>" ></a>

                <% }
                }%>

            </div>
        </div>


</body>
</html>
