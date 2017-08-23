<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Nimen näyttäminen</title>
	<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
	<p>
		Kirjan nimi: <c:out value="${kirja.nimi}"/><br />
		Kirjailija: <c:out value="${kirja.kirjoittaja}"/><br />
		ISBN: <c:out value="${kirja.isbn}"/>
	</p>
	<p><a href="index.jsp">kokeile uudestaan</a></p>
</body>
</html>