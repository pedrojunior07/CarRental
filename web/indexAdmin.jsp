<%-- 
    Document   : newjsp
    Created on : May 3, 2024, 8:51:31 AM
    Author     : FRANCE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Carro,DAO.*,DAO.DATABASE.*" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        <!--<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />-->
        <link rel="stylesheet" href="./style.css">
        <!--<link rel="stylesheet" href="css/addCar.css"/>-->
        <title>Home</title>

    </head>
    <body>

        <%@ include file="sidebar.jsp" %>


        <!-- conteudo principal -->
        <div class="content">
            <%@ include file="navbar.jsp" %>

        </div>
        <div class="content" id="dynamic-content">

        </div>


        <script src="script.js"></script>

        <script>
            // Função para carregar conteúdo dinâmico via Fetch API
            function loadPage(page) {
                fetch(page)
                        .then(response => response.text())
                        .then(data => {
                            document.getElementById('dynamic-content').innerHTML = data;
                        })
                        .catch(error => console.error('Error:', error));
            }

            // Associar scripts aos botões do sidebar
            document.addEventListener('DOMContentLoaded', function () {
                document.querySelectorAll('.side-menu a').forEach(function (element) {
                    element.addEventListener('click', function (event) {
                        event.preventDefault();
                        var page = this.getAttribute('href');
                        loadPage(page);
                    });
                });
            });
        </script>
</html>
