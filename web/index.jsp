<%-- 
    Document   : viewDados
    Created on : 01/05/2024, 21:21:02
    Author     : Pedro
--%>

<%@page import="DAO.DATABASE.CarroDao"%>
<%@page import="DAO.DATABASE.Conexao"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="./CSS/estilo.css"/>

        
        <style>
            body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 800px;
    margin: 50px auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 8px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}

.heading {
    text-align: center;
    color: #333;
}

.button {
    display: inline-block;
    padding: 10px 20px;
    margin-top: 20px;
    background-color: #007bff;
    color: #fff;
    text-decoration: none;
    border-radius: 4px;
    transition: background-color 0.3s ease;
}

.button:hover {
    background-color: #0056b3;
}


.table-container {
    overflow-x: auto;
}

table {
    width: 100%;
    border-collapse: collapse;
    border-radius: 8px;
    overflow: hidden;
}

table th,
table td {
    padding: 12px;
    text-align: left;
}

table th {
    background-color: #007bff;
    color: #fff;
}

table tr:nth-child(even) {
    background-color: #f2f2f2;
}

table tr:hover {
    background-color: #ddd; 
}

a {
   
    color: #007bff; /* Cor padrão do link */
    border:solid 1px #ffffff ;
    text-decoration: none; /* Remover sublinhado padrão */
    transition: color 0.3s ease; /* Transição suave de cor */
}

a:hover {
    color: #0056b3; /* Cor do link ao passar o mouse */
}
        </style>
    </head>
    
    
    
    
    
    
    
    
    
    
    <body>
        <%@ page import=" DAO.* , Model.*,java.util.*"  %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
        
        <h1>Listagem</h1>
        <br>
        <h2><a href="adicionar.jsp">ADICIONAR</a></h2>
        
        <% 
         
        %>
        
        
            
               
                <div> 
                 
                   <img src="./icons/user.png" alt="">
                </div>
               
            
       

    </body>
</html>
