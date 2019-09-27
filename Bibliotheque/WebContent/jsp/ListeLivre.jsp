<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="fr.cesi.bibliotheque.classe.Livres" %>
<%@page import="fr.cesi.bibliotheque.classe.LivresDAO"%>

<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="page.css"/>
<head>
<meta charset="ISO-8859-1">
<%@ include file="Header.jsp" %>
<title>Liste livres</title>
</head>

<body>
<% if (session.getAttribute("username")  != null) { %>
	<% List<Livres> mesLivres = new ArrayList<Livres>();
	mesLivres = LivresDAO.getAllProducts(); %> 
	<br> 
	
	<% for (Livres item :mesLivres){ %> 
	<div class="form-style-6">
		<strong>Cote: </strong> <%= item.getId() %> 
		<strong>Titre: </strong><%= item.getTitre() %> 
		<strong>Auteur: </strong><%= item.getAuteur() %> 
		<% Boolean etat = item.getEtat();
		if(etat == true){ %>
			<strong>Etat : </strong><%= " Disponible"%>
		<% } else {%>
			<strong>Etat: </strong><%= "Non Disponible"%>
		<%} %> 
		
		<% String username = (String)session.getAttribute("username") ; 
		if (username.equals("Admin")) { %>
			<% String chemin_suppr = "http://localhost:8080/Bibliotheque/auth/SupprimerLivre?id=" + item.getId(); %> 
			<a href="<%=chemin_suppr%>">Supprimer</a> 
		<%} %> 
		<% if (session.getAttribute("username")  != null) { %>
			<% if (etat == true) { %>
				<% String chemin_resa = "http://localhost:8080/Bibliotheque/ReserverLivre?id=" + item.getId(); %>
				<a href="<%=chemin_resa%>">Reserver</a> 
			<% }else if (etat == false) { %>
				<% String chemin_resa = "http://localhost:8080/Bibliotheque/RendreLivre?id=" + item.getId(); %>
				<a href="<%=chemin_resa%>">Rendre</a> 
			<%} %>
			
		<%} %>
		<br>
	</div>	
	 <%} %> 
 <%} %> 

</body>
</html>