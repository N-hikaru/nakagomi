

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/countSession")
public class countSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	HttpSession sessionCount = null;
	int count = 2;


	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();


		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>訪問回数テスト (セッション)</h1>");

		//引数に"false"を指定した場合、セッションが存在しない場合にはnullが帰ってくる
		//初回アクセス時にはセッションが取得されていないため、 if (sessionCount == null)がtrueとなる
		sessionCount = request.getSession(false);

        if (sessionCount == null){
            out.println("<p>初めての訪問です。</p>");

        	//セッションを取得
        	HttpSession sessionCount = request.getSession();
        	//セッションの名前:acsessCount,値:1 で登録
        	sessionCount.setAttribute("acsessCount", "1");
        	//セッションに格納した情報の取得
        	String value = (String)sessionCount.getAttribute("acsessCount");
        	//"ture"を指定した場合、セッションが開始されていなければ新規にセッションを開始した後でそのセッションを返す
            sessionCount = request.getSession(true);

        }else{
        	//HttpSession sessionCount = request.getSession();
        	//int count = Integer.parseInt(sessionCount.getSession()) + 1;
        	out.println("<p>");
        	out.println(count);
        	out.println("回目の訪問です。</p>");
          	count++;
          }

        out.println("<a href=\"countSession\">画面を再訪問</a>");
        out.println("</body>");
        out.println("</html>");

	}
}
