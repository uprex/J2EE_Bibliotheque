<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import = "java.util.*" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<%@ include file="/jsp/Header.jsp" %>
</head>
<body>
	<div class="form-style-6">
		Session créé depuis: <%=new Date(session.getCreationTime())%>
	</div>
</body>
</html>