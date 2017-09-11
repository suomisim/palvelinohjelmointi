<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
SimpleDateFormat formatoija = new SimpleDateFormat("dd.MM.yyyy");
Date nykyhetki = new Date();
String muotoiltuAika = formatoija.format(nykyhetki);    
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/auth.css">
<title>Etusivu</title>
</head>
<body>
<p style="text-align: right;"><c:out value="${kayttajatiedot.username}"/><br/>
<a href="kirjaudu_ulos">Kirjaudu ulos</a>
<h1 style="text-align: center;">Tervetuloa painonhallintasivulle!</h1>

<h3>Anna painosi: </h3>

	<form action="henkilot" method="post">
		<table>

			<tfoot>
				<tr>
					<td><input type="text" name="date" value="<%=muotoiltuAika %>" readonly/></td>
					<td><input type="text" name="id" value="${kayttajatiedot.id}" hidden/></td>
					<td><input type="text" name="nimi" value="${kayttajatiedot.username}" readonly/></td>
					<td><input type="text" name="paino" placeholder="painosi: "/></td>
					<td><button type="submit" value="submit"><b>+</b></button></td>		
				</tr>
			</tfoot>
		</table>
	</form>
	<form action="painot" method="post">
		<tr>
			<td><input type="text" name="id" value="${kayttajatiedot.id}" hidden/></td>
			<td><input type="text" name="nimi" value="${kayttajatiedot.username}" hidden/></td>
			<td><button type="submit" value="show"><b>Näytä painohistoriasi</b></button></td>
		</tr>
	</form>
	<table>
		<thead>
			<tr>
				<td>NIMI</td>
				<td>PÄIVÄ</td>
				<td>PAINO</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${painohenkilot}" var="phenk">
			<tr>
				<td><c:out value="${kayttajatiedot.username}" /></td>
				<td><c:out value="${phenk.date}" /></td>
				<td><c:out value="${phenk.paino}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>

