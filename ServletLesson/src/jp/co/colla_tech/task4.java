package jp.co.colla_tech;

import java.util.Random;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/task4")
public class task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

		public static String RANDAM(){
		//String型の配列luckArrayに"大吉","中吉","小吉","末吉","凶","大凶"を格納
		String[] luckArray = {"大吉","中吉","小吉","末吉","凶","大凶"};

		//ランダムにluckArrayから要素を一つ取り出す
		Random luck = new Random();
		String Randamluck = luckArray[luck.nextInt(5)];
		//ランダムで取り出した要素を返す
		return Randamluck;

	}



}
