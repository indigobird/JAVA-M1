<%-- 
    Document   : modules
    Created on : 27 sept. 2012, 15:38:25
    Author     : fasalles
--%>

<%@page import="Model.Module"%>
<%@page errorPage="error.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="modules" class="java.util.LinkedHashSet" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css">
        <title>Liste des modules enseignés</title>
    </head>
    <body>
        <jsp:include page="navbar.jsp" />
        <section class="container">
            <div class="row">
                <header class="hero-unit">
                    <h1>Liste des modules enseignés</h1>
                </header>
                <table class="table table-bordered table-striped" >
                    <thead>
                        <tr>
                            <th>Module</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% for(Object row: modules){ %>
                            <% Module module = (Module) row; %>
                            <tr>
                                <td>
                                    <a href="showModule?id=<%= module.getId() %>" title="Visualiser les élèves du module"><%= module.getIntitule() %></a>
                                </td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </section>
    </body>
</html>
