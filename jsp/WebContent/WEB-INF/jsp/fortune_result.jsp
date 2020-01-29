<%@ page import="Beans.FortuneBeans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<% FortuneBeans fortuneTodayDate = (FortuneBeans)request.getAttribute ("dateKeep"); %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% out.println("<h1>↓" + fortuneTodayDate.gettoday() + "↓</h1>");%>
<% out.println("<h1>" + fortuneTodayDate.getfortune() + "</h1>");%>
</body>
</html>