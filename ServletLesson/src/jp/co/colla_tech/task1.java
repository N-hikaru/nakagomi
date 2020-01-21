package jp.co.colla_tech;

import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JLabel;

/**
 * Servlet implementation class task1
 */
@WebServlet("/ServletKadai1")
public class task1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<title>Servlet Task</title>");
		out.println("<h1>Hell World</h1>");
		 JLabel label1 = new JLabel("初めてのサーブレット");
		    label1.setFont(new Font("Arial", Font.PLAIN, 5));
		out.println("<p>初めてのサーブレット</p>");

	}





}
