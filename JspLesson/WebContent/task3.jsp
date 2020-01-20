<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%! int count = 0; %>
</head>
<body>
	<%-- 訪問回数 --%>
 	<h1>訪問回数:<%= count++ %>

 	</h1>

	<%-- yyyy年MM月dd日 --%>
	<p>
		<%-- Calendarクラスのオブジェクトを生成する --%>
		<%! Calendar cl = Calendar.getInstance(); %>
		<%-- SimpleDateFormatクラスでフォーマットパターンを設定する --%>
		<%! SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日"); %>
		<%-- (sdf.format(cl.getTime())); 今日の年月日を出力 --%>
		<% out.print("今日の日付:" + (sdf.format(cl.getTime()))); %>
	</p>

</body>
</html>