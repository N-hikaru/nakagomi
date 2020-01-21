package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletKadai2")
public class task2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		 //Calendarクラスのオブジェクトを生成する
        Calendar cl = Calendar.getInstance();
        //SimpleDateFormatクラスでフォーマットパターンを設定する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //(sdf.format(cl.getTime())); 今日の年月日を
        out.print("<h1>" + "今日の日付:" + (sdf.format(cl.getTime())) + "</h1>");
	}

}

