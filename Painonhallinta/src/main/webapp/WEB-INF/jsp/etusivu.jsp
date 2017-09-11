<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/auth.css">
<title>Etusivu</title>
</head>
<body>


	<c:if test="${not empty param.onnistui }">
		<p class="Viesti">Rekister�ityminen onnistui. Kirjaudu sis��n!</p>
	</c:if>

	<c:if test="${not empty error }">
		<p class="Virhe">
			<c:out value="${error}" />
		</p>
	</c:if>
		<h2>Ole hyv� ja kirjaudu sis��n:</h2>
		<p>Jos et ole viel� rekister�itynyt, ole hyv� ja rekister�idy</p>
		<div id="login">
			<form action="kirjaudu" method="post">
				<h1>Sis��nkirjautuminen</h1>
				<table>
					<tr>
						<td>K�ytt�j�tunnus</td>
						<td><input type="text" name="username"  value="<c:out value="${prev_login_username}"/>"/></td>
					</tr>
					<tr>
						<td>Salasana</td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><button type="submit">Kirjaudu sis��n</button></td>
					</tr>
				</table>
			</form>
		</div>
		<div id="register">
			<form action="rekisteroidy" method="post">
				<h1>Rekister�ityminen</h1>
				<table>
					<tr>
						<td>K�ytt�j�tunnus</td>
						<td><input type="text" name="username" value="<c:out value="${prev_reg_username}"/>"/></td>
					</tr>
					<tr>
						<td>Salasana</td>
						<td><input type="password" name="password" /></td>
					</tr>
					<tr>
						<td>Salasana uudestaan</td>
						<td><input type="password" name="password2" /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><button type="submit">Rekister�idy</button></td>
					</tr>
				</table>
			</form>
		</div>
</body>
</html>

