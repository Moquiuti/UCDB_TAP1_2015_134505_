<%@page import="br.ucdb.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ALunos</title>
</head>
<body>
	<h1>Lista de Alunos Cadastrados</h1>
		<%
			List<Aluno> alunos =(List<Aluno>) request.getAttribute("alu");	
		
				for (Aluno a : alunos){
					out.print (a.getNome());
					out.print ("<br>");
					out.print (a.getRg());
					out.print ("<br>");
					out.print (a.getCpf());
					out.print ("<br>");
					out.print (a.getSexo());
					out.print ("<br>");
					out.print (a.getUf());
					out.print ("<br>");
				}
		%>
</body>
</html>