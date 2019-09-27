<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajout produit</title>
 <%@ include file="/jsp/Header.jsp" %>
</head>
<body>
<form name="formulaire" method="post" action="/Bibliotheque/AddLivre">
<div class="form-style-5">
	<fieldset>
		<legend><span class="number">1</span>Ajout d'un livre</legend>
		<input type="number" name="id" placeholder="Cote *" required size="10">
		<input type="text" name="titre" placeholder="Titre *" required size="50">
		<input type="text" name="auteur" placeholder="Auteur* " required size="50">
	</fieldset>
	<input type="submit" value="Je termine ma partie d'ajout de livre">
</div>
</form>

<br><br>
</body>
</html>