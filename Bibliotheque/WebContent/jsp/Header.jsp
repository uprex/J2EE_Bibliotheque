<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>

<link rel="stylesheet" type="text/css" href="page.css"/>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<ul>
  <img src="https://cdn2.iconfinder.com/data/icons/freecns-cumulus/16/519609-108_Bookmark-256.png" alt="book" width="40" height="40">
  <li><a href="http://localhost:8080/Bibliotheque/jsp/Accueil.jsp">Acceuil</a>
  <%	HttpSession session2 = request.getSession(); 
  		String user = (String) session2.getAttribute("username");
		if (session2.getAttribute("username") != null) {%>
		
  <li><a href="http://localhost:8080/Bibliotheque/ListeLivre">Liste livre</a></li>
  <li><a href="http://localhost:8080/Bibliotheque/Logout">Logout</a></li>
  <% }else{%>
  <li><a href="http://localhost:8080/Bibliotheque/jsp/Login.jsp">Login</a></li>
  <% }%>
  <% if (session2.getAttribute("username") != null) {%>
  	<% if (user.equals("Admin") == true){ %>
  <li><a href="http://localhost:8080/Bibliotheque/auth/Admin.jsp">Admin</a></li>
  <li><a href="http://localhost:8080/Bibliotheque/auth/AddLivre.jsp">Ajout Livre</a></li>
   <% }%>
  <% }%>
</ul>


</body>
</html>