package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servletkadai3")
public class HtmlTemplate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		HtmlTemplate.header(out);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>Sevrlet kadai</title>");
		out.println("</head>");
		out.println("<body>");

		HtmlTemplate.footer(out);
		out.println("</body>");
		out.println("</html>");
	}

	private static void header(PrintWriter out) {
		out.println("<p>↓占い結果↓</p>");

		//task4クラスのRANDAMメソッドを呼び出す
		String result = task4.RANDAM();
		out.println("<h1>" + result + "</h1>");
	}

	private static void footer(PrintWriter out) {

	}




}
