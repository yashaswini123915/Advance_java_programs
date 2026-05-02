<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>

<h2>Registration Form</h2>

<form:form action="${pageContext.request.contextPath}/student/submit"
           modelAttribute="student">

First Name:
<form:input path="firstName"/>
<form:errors path="firstName" cssStyle="color:red"/>
<br><br>

Last Name:
<form:input path="lastName"/>
<form:errors path="lastName" cssStyle="color:red"/>
<br><br>

Courses:
<form:checkbox path="course" value="DCA"/> DCA
<form:checkbox path="course" value="Web Developer"/> Web Developer
<form:checkbox path="course" value="Web Designer"/> Web Designer
<form:errors path="course" cssStyle="color:red"/>
<br><br>

Fees:
<form:radiobutton path="fees" value="Cash"/> Cash
<form:radiobutton path="fees" value="Cheque"/> Cheque
<form:radiobutton path="fees" value="DD"/> DD
<form:errors path="fees" cssStyle="color:red"/>
<br><br>

Place:
<form:select path="place">
    <form:option value="" label="--Select--"/>
    <form:option value="Ongole"/>
    <form:option value="Nellore"/>
</form:select>
<form:errors path="place" cssStyle="color:red"/>
<br><br>

Qualification:
<form:select path="qualification" multiple="true">
    <form:option value="SSC"/>
    <form:option value="Inter"/>
    <form:option value="Degree"/>
</form:select>
<form:errors path="qualification" cssStyle="color:red"/>
<br><br>

Address:
<form:textarea path="address"/>
<form:errors path="address" cssStyle="color:red"/>
<br><br>

<input type="submit" value="Submit"/>

</form:form>

</body>
</html>