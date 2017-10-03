<%@page contentType="text/html;meta charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<title><spring:message code="paino.create.heading" /></title>
<link rel="stylesheet" type="text/css" href="../resources/styles/form.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>	
<body>
	<div id="langsel">
		<a href="?lang=en"><img src="https://images.apple.com/support/assets/images/layout/icons/flags/country/united_states.png" alt="" width="30" height="30"></a> | <a href="?lang=fi">
		<img src="https://images.apple.com/support/assets/images/layout/icons/flags/country/finland.png" alt="" width="30" height="30"></a>
	</div>

	<h1>
		<spring:message code="paino.create.heading" />
	</h1>
		
		<spring:hasBindErrors name="paino">
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
				<div class="alert alert-success">
  					<strong>Success!</strong><spring:message code="paino.create.success" />
				</div>
				<div class="btn-group">	
					<button type="submit" class="btn btn-primary"><spring:message code="paino.create.add" /></button>
					<a href="lista" class="btn btn-info"><spring:message code="paino.create.show" /></a>
					<button type="submit" name="action" value="show" class="btn btn-primary"><spring:message code="paino.create.showPvm" /></button>
				</div>
			</fieldset>
		</form:form>
</body>
</html>