<%@page contentType="text/html;meta charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="paino.viewAll.title" /></title>
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>	
<body>
	<div id="langsel">
		<a href="?lang=en"><img src="https://images.apple.com/support/assets/images/layout/icons/flags/country/united_states.png" alt="" width="30" height="30"></a> | <a href="?lang=fi">
		<img src="https://images.apple.com/support/assets/images/layout/icons/flags/country/finland.png" alt="" width="30" height="30"></a>
	</div>
	<h1>
		<spring:message code="paino.viewAll.heading" />
	</h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<td><spring:message code="paino.viewAll.date" /></td>
				<td><spring:message code="paino.viewAll.weight" /></td>
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
	<a href="uusi" class="btn btn-primary"><spring:message code="back" /></a><br />
</body>
</html>