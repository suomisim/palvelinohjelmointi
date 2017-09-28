<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<title>Henkilön lisääminen</title>
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>	
<body>

	<h1>
		<spring:message code="paino.create.heading" />
	</h1>
		
		<spring:hasBindErrors name="henkilo">
			<p class="Virheotsikko"><spring:message code="paino.create.errors" />:</p>
			<div class="Virheblokki"><form:errors path="*"/></div>
		</spring:hasBindErrors>
		
		<form:form modelAttribute="paino" method="post">
		  	<fieldset>		
				<legend><spring:message code="paino.create.legend" /></legend>
				<p>
					<form:label	path="pvm"><spring:message code="paino.create.pvm" /></form:label><br/>
					<form:input path="pvm" cssErrorClass="VirheellinenKentta"/> <form:errors path="pvm" cssClass="Virheteksti"/>		
				</p>
				<p>	
					<form:label path="paino"><spring:message code="paino.create.paino" /></form:label><br/>
					<form:input path="paino" cssErrorClass="VirheellinenKentta"/> <form:errors path="paino" cssClass="Virheteksti"/>	
				</p>
				<div class="btn-group">	
					<button type="submit" class="btn btn-primary">Lisää</button>
					<a href="lista" class="btn btn-info">Näytä painohistoriasi</a>
				</div>
			</fieldset>
		</form:form>
</body>
</html>