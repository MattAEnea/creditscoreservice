<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@include file = "/static/link.html"%>

<html>
<head>
<meta charset="UTF-8">
<title>Credit Score</title>
</head>
<body>
	<p>Hello ${score.getName()}</p>
	<p>Your credit score is: ${score.getCreditScore()}</p>
</body>
</html>