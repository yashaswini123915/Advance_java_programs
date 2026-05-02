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
<h3>Railway Reservation Form</h3>

<form:form action="${pageContext.request.contextPath}/reservation/submitForm"
           modelAttribute="reservation">

    First Name:
    <form:input path="firstName"/>

    <br><br>

    Last Name:
    <form:input path="lastName"/>

    <br><br>

    Gender:
    Male <form:radiobutton path="gender" value="Male"/>
    Female <form:radiobutton path="gender" value="Female"/>

    <br><br>

    Meals:
    BreakFast <form:checkbox path="food" value="BreakFast"/>
    Lunch <form:checkbox path="food" value="Lunch"/>
    Dinner <form:checkbox path="food" value="Dinner"/>

    <br><br>

    Leaving From:
    <form:select path="cityFrom">
        <form:option value="Ghaziabad"/>
        <form:option value="Modinagar"/>
        <form:option value="Meerut"/>
        <form:option value="Amritsar"/>
    </form:select>

    <br><br>

    Going To:
    <form:select path="cityTo">
        <form:option value="Ghaziabad"/>
        <form:option value="Modinagar"/>
        <form:option value="Meerut"/>
        <form:option value="Amritsar"/>
    </form:select>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>


</body>
</html>