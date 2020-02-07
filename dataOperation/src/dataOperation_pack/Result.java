package dataOperation_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;


/*	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストで文字コードの設定
		request.setCharacterEncoding("UTF-8");
		//レスポンスで文字コードの設定
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		//名前
		String namebox = request.getParameter("name");
		//性別
		String sexbox = request.getParameter("sex");
		//お問い合わせ種類
		String Querybox = request.getParameter("Query");
		//お問い合わせ内容
		String Detailsbox = request.getParameter("Details");

		out.println("<html><head></head><body>");
		out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p>");
		out.println("<p>名前:" + namebox + '様');
		out.println("<br>");
		out.println("性別:" + sexbox );
		out.println("<br>");
		out.println("お問い合わせ種類:" + Querybox );
		out.println("<br>");
		out.println("お問い合わせ内容:" + Detailsbox + "</p>");
		out.println("</body></html>");

	}

}
