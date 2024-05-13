<%-- 
    Document   : AdicionarImagem.jsp
    Created on : 09/05/2024, 22:18:37
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Adicionar Imagens</title>
<link rel="stylesheet" href="img.css">
</head>
<body>
    
    <%  String matricula = request.getParameter("matricula");
      request.setAttribute("matricula", matricula);
    %>
<div class="container">
  <h1>Adicionar Imagens na Matricula : ${matricula}</h1>
  
  <form method="post" action="UploadServlet?matricula=${matricula}" enctype="multipart/form-data">
                <input type="file" name="file" multiple /> <!-- Adiciona o atributo multiple -->
                <input type="submit" value="Upload"/>
            </form>
  <div id="preview"></div>
</div>
<script src="scripts.js"></script>
</body> 
</html>
