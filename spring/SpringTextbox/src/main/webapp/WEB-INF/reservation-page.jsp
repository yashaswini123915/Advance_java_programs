<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- MANDATORY LINE -->    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Railway Reservation Form</h3>

<form:form action="submitForm"

modelAttribute="reservation">

First Name:

<form:input path="firstName"/>

<br><br>

Last Name:

<form:input path="lastName"/>

<br><br>

<input type="submit" value="Submit"/>

</form:form>

</body>
</html>