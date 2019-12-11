
import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		//Scannerの使用
		Scanner scan = new Scanner(System.in);
		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		int intNum3 = scan.nextInt();
		scan.close();
			//出力
			System.out.println(intNum1);
			System.out.println(intNum2);
			System.out.println(intNum3);

		//変数の初期化(合計値)
		int intNum4 = intNum1 + intNum2 + intNum3;
			//合計値を出力
			System.out.println("合計: "+intNum4);

		//平均(3で割った時)
		//変数の初期化(平均(3で割った時))
        int intNum5 = intNum4/3;
        	//出力
        	System.out.println("平均(3割った時):"+intNum5);

        //平均(3.0で割った時)
        //型変換
        double doubleNum1 = intNum4;
        //変数の初期化(平均(3.0で割った時))
        double doubleNum2 = doubleNum1/3.0;
        	//出力
        	System.out.println("平均(3.0で割った時):"+doubleNum2);

	}

}
