<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lomake</title>
	<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>
	<h3>Anna kirjan tiedot:</h3>
	<form action="nayta_kirja" method="post">
	<table>
		<tr><td>Kirjan nimi</td><td><input type="text" name="kirjanimi"/></td></tr>
		<tr><td>Kirjoittaja</td><td><input type="text" name="kirjoittaja"/></td></tr>
		<tr><td>ISBN</td><td><input type="text" name="isbn"/></td></tr>
		<tr><td>&nbsp;</td><td><button type="submit">Lähetä</button></td></tr>
	</table>
	</form>
</body>
</html>