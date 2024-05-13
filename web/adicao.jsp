<%-- 
    Document   : adicao.jsp
    Created on : 08/05/2024, 22:17:14
    Author     : Pedro
--%>

<%--<%@page import="DAO.DATABASE.CarroDao.selectAll(...)"%>--%>
<%@page import="DAO.*,Model.*,DAO.DATABASE.*,java.util.*" %>
<jsp:useBean id="u" class="Model.Carro"></jsp:useBean>
    <jsp:setProperty property="*" name="u"/>
<%
 new CarroDao(new Conexao().getConnection());
boolean ins = CarroDao.insertBaseDedados(u);
//out.write("Addicionado? "+ins);
 response.sendRedirect("AdicionarImagem.jsp?matricula="+u.getMatricula());
%>