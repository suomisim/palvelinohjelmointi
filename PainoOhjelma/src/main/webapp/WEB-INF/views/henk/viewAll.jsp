<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Painohistoriasi</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>	
<body>
	<h1>
		Painohistoriasi:
	</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<td>PÄIVÄMÄÄRÄ</td>
				<td>PAINO</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${painot}" var="pai">
			<tr>
				<td><c:out value="${pai.pvm}" /></td>
				<td><c:out value="${pai.paino}" /></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="uusi" class="btn btn-primary">Takaisin</a><br />
</body>
</html>