package Beans;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.annotation.WebServlet;


@WebServlet("/FortuneBeans")
public class FortuneBeans implements Serializable {

	//Date型のtoday
	private java.util.Date today;
	//String型のfortune
	private String fortune;

	//publicで引数なしのコンストラクタ
    public FortuneBeans() {}


    //日付(today)を設定
    public void settoday(Date today) {
    	this.today = today;
    }
    //日付(today)を取得
    public Date gettoday() {
    	return today;
    }

 //占い
    //占い結果(fortune)を設定
    public void setfortune(String fortune) {
    	//引数の変数fortuneをこのクラスのfortuneに代入することによって、getした時に変数this.fortuneが呼ばれる
    	this.fortune = fortune;
    }

    //占い結果(fortune)を取得
    public String getfortune() {
    	return fortune;
    }

}
