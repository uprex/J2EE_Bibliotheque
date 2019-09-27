<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>
 <%@ include file="Header.jsp" %>
</head>
 
<br><br>
<form name="formulaire" method="post" action="/Bibliotheque/Login">
<div class="form-style-5">
	<fieldset>
		<legend><span class="number">1</span>Information de connexion</legend>
		<input type="text" name="name" placeholder="Your Name *">
		<input type="password" name="password" placeholder="Your password * ">
	</fieldset>
	<input type="submit" value="Connexion">
</div>
</form>



</body>
</html>