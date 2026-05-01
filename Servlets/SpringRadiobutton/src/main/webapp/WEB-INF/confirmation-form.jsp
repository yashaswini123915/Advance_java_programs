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

<h2>Reservation Confirmed</h2>

First Name: ${reservation.firstName} <br>
Last Name: ${reservation.lastName} <br>
Gender: ${reservation.gender}

</body>

</html>