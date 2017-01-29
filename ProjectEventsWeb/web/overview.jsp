<%-- 
    Document   : Overview
    Created on : Dec 13, 2016, 1:16:52 PM
    Author     : Andries Kevin
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAL.zaal"%>
<%@page import="DAL.afbeelding"%>
<%@page import="ViewModel.Zaal"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>






<head>
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="css/grid.css"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="css/image.css"  media="screen,projection"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Zaalzoeker</title>
</head>
<body>
    <div class="container">
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <form action="./ZaalServlet" method="POST">

            <nav>
                <div class="nav-wrapper" >
                    <a href="#!" class="brand-logo"><i class="material-icons">polymer</i>Overzicht zalen</a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href="../ProjectEventsWeb/search.jsp"><i class="material-icons">search</i></a></li>
                        <li><a href="../ProjectEventsWeb/OverviewServlet"><i class="material-icons">refresh</i></a></li>
                        <li><a href="../ProjectEventsWeb/ZaalServlet"><i class="material-icons">home</i></a></li>
                    </ul>
                </div>

            </nav>
        </form>
    </div>

    <br>
    <br>
    <br>

    <div class="itemWrapper">
        <div id="infoPageWrapper" class="center-align">
            
            <!-- Ophalen van alle attributen -->
            <%  
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
                                <div class="collapsible-body"><p>Tarief: <%= z.getTarieven()%>0 &#8364</p></div>
               
                            </li>
                            <li>
                                <div class="collapsible-header" ><i class="material-icons">picture_in_picture</i>Afbeeldingen</div>
                                <div class="collapsible-body"><p>

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
