<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>유저 목록</title>
</head>
<body>
<h1>유저 목록:</h1>
<c:forEach items="${requestScope.listusers}" var="listusers">
       <h2>${listusers}</h2>
</c:forEach>
</body>
</html>