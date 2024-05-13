<%-- 
    Document   : viewDados
    Created on : 01/05/2024, 21:21:02
    Author     : Pedro
--%>

<%@page import="DAO.DATABASE.CarroDao"%>
<%@page import="DAO.DATABASE.Conexao"%>
<%@page import="javax.swing.ImageIcon"%>
<%@page import="Model.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="./css/estilo.css"/>

        
    <body>
        <%@ page import=" DAO.* , Model.*,java.util.*"  %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
     <div class="conteiner">
  <div  class="menu">
      <a class="item" href="./addCarro.jsp">Adicionar Carro</a>
  </div>
  <div class="content" id="contents">
      
      
      
  </div>
  </div>  

  <script>
     document.querySelectorAll('a').forEach(ink =>{
            const conteudo = document.getElementById('contents');
            ink.onclick = function(e){
                e.preventDefault();

fetch(ink.href)
.then(resp => resp.text())
.then(html => conteudo.innerHTML = html);
}
        });
  </script>
</body>
               
            
       

    </body>

