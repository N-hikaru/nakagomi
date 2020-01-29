
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.FortuneBeans;

@WebServlet("/ServletJspKadai3")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		//final String result = "/WebContent/fortune_result.jsp";

	//日付:スコープに格納する情報
		Date today = new Date();

	//占い:スコープに格納する情報
		//配列の初期化
		String[] fortunes = {"大吉","中吉","小吉","末吉","凶","大凶"};
		//配列fortunesの要素をランダムで取り出す
		Random randam = new Random();
		//ランダムで取り出した要素をluckに格納
		String fortune = fortunes[randam.nextInt(6)];

	//リクエストスコープにデータを格納
		FortuneBeans fortuneTodayDate = new FortuneBeans();
		fortuneTodayDate.settoday(today); //日付
		fortuneTodayDate.setfortune(fortune); //占い
		request.setAttribute("dateKeep",fortuneTodayDate);


	//フォワード処理
		request.getRequestDispatcher("/WEB-INF/jsp/fortune_result.jsp").forward(request,response);

		///WebContent/fortune_result.jsp

	}






}
