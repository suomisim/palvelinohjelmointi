<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Henkilön tietojen näyttäminen</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="../resources/styles/common.css">
</head>	
<body>
	<h1>
		Kaikki henkilöt:
	</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<td>ETUNIMI</td>
				<td>SUKUNIMI</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${henkilot}" var="henk">
			<tr>
				<td><c:out value="${henk.etunimi}" /></td>
				<td><c:out value="${henk.sukunimi}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="uusi">Takaisin</a>
</body>
</html>