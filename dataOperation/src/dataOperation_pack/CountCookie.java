package dataOperation_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>");
    out.println("</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>訪問回数テスト (クッキー)</h1>");

    //クライアントから送られたクッキーを取り出す
    Cookie cookie[] = request.getCookies();
    Cookie accessCookie = null;

    //何らかのクッキーがある場(内容を問わない)

    if (cookie != null){

      for (int i = 0 ; i < cookie.length ; i++){
    	 //配列の各要素の名前が"accessCount"であるか調べる
        if (cookie[i].getName().equals("accessCount")){
        //要素の名前が"accessCount"である場合、その内容を
         accessCookie = cookie[i];
        }
      }

      //何らかのクッキーがあり対象のクッキー(accessCookie)がある場合
      if (accessCookie != null){
        int accessCount = Integer.parseInt(accessCookie.getValue()) + 1;

        out.println("<p>");
        out.println(accessCount);
        out.println("回目の訪問です。</p>");

        accessCookie.setValue(Integer.toString(accessCount));
        accessCookie.setMaxAge(300);
        response.addCookie(accessCookie);
        out.println("<a href=\"CountCookie\">画面を再訪問</a>");

       //何らかのクッキーがあるけど対象のクッキー(accessCookie)でない場合
      }else{
    	  frist(request, response);
      }

      	//何のクッキーもない場合
    }else{
    	frist(request, response);
    }


  }

private void frist(HttpServletRequest request, HttpServletResponse response)
		throws IOException {


	//レスポンスの文字コードの設定
	response.setContentType("text/html;charset=UTF-8");
	ServletResponse response2 = response;  ////response2を「response」にしたらエラー


	PrintWriter out = response2.getWriter();  //response2を「response」にしても500エラー
	out.println("<a> 初めての訪問です。</a>");
	out.println("<br>");
	out.println("<br>");

	//クッキーを保存
	Cookie accessCookie = new Cookie("accessCount", "1");
	//有効期限を5分に設定
	accessCookie.setMaxAge(30);
	// クライアントから送られたクッキーを取り出す
	//次回アクセス時よりこのクッキーが使用可能
	response.addCookie(accessCookie);

	//クッキーの値を取得 クッキー情報がレスポンスに保管され、クライアントに送信
	@SuppressWarnings("unused")
	Cookie[] access = request.getCookies();


	out.println("<a href=\"CountCookie\">画面を再訪問</a>");

}
}