<%-- 
    Document   : viaturas
    Created on : May 7, 2024, 1:35:17 PM
    Author     : FRANCE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
      
<div class="conteiner">
    <h1>Adicionar Carro</h1>        
    <form  action="adicao.jsp" method="POST">
   <div class="formulario"> 
        <div>
            <input type="text" name="fabricante" placeholder="Marca" class="inputs" id="">
            <input type="text" name="modelo" placeholder="Modelo" class="inputs">
            <input type="number"  name="anoDeFabrico" placeholder="Ano De fabrico" class="inputs">
            <input type="number" name="quilometosPercoridos" placeholder="Km Percoridos" class="inputs">
            <input type="number" name="preco" placeholder="Preco" class="inputs">
            <input type="text" name="matricula" placeholder="Matricula" class="inputs">
            <textarea name="descricao" id="descricao" class="inputs" placeholder="Descricao" rows="10"></textarea>
        </div>
        <div class="select">
           <select name="categoria" id="categoria" class="inputs">
            <option value="SUV">suv</option>
            <option value="OFF-ROAD">off-road</option>
            <option value="luxo">luxo</option>
            <option value="van">van</option>
            <option value="pickUp">PickUp</option>
           </select>
            <select name="tipoDeComustivel" id="tipoDeComustivel"  class="inputs">
            <option value="Gasolina">Gasolina</option>
            <option value="Gas">Gas</option>
            <option value="Disel">Disel</option>
            <option value="Eletrico">Eletrico</option>
           </select>
            <select name="cor" id="cor"  name="cor" class="inputs">
            <option value="Branco">Branco</option>
            <option value="Preto">off-road</option>
            <option value="Roxo">Preto</option>
            <option value="Prata">Prata</option>
            <option value="Amarelo">Amarelo</option>
            <option value="Gray">Gray</option>
           </select>
           <select name="tracao" id="tracao" class="inputs" %>
            <option value="Manual">Manual</option>
            <option value="Automatico">Aultomatico</option>
            <option value="hibrido">Preto</option>
           </select>
            <input type="number" name="preco" placeholder="Preco" class="inputs">
            <input type="number" name="assentos" placeholder="Assentos" class="inputs">
            <input type="number" name="km_litro" placeholder="km/litro" class="inputs">
       <button type="submit" value="">Addicionar</button>
        </form>
        </div>
    </div>
            
        
    </div>
    </body>
</html>
