<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TASK</title>
</head>
<body>

	<%-- 125 - 15 = 110 --%>
	<%! int answer1 = subtraction(125, 15); %>
	<h1> 125 - 15 = <%= subtraction(125, 15) %> </h1>

	<%-- 17 - 21 = -4 --%>
	<%! int answer2 = subtraction(17, 21); %>
	<h1> 17 - 21 = <%= subtraction(17, 21) %> </h1>

	<%-- 引数を変数に代入して演算を行い戻り値を返す --%>
	<%! static int subtraction(int num1, int num2){
		int answer = num1 - num2;
		return answer;
	}
	%>

</body>
</html>