<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@include file = "/static/link.html"%>

<html>
<head>
<meta charset="UTF-8">
<title>Please Enter SSN</title>
</head>
<body>
	<form method="post" action="score">
		<b>Enter SSN: </b>
		<input type="password" name="ssn"/><br>
		<input type="submit" value="save"/>
	</form>
</body>
</html>