
public class kadai2 {

	public static void main(String[] args) {

		//変数の初期化
		int intNum1 = 10;
		int intNum2 = 12;
		int intNum3 = 13;
		//出力
		System.out.println("合計:\b"+(intNum1 + intNum2 + intNum3));

		//3で割った時の平均値
		//変数の初期化
		int intNum4 = intNum1 + intNum2 + intNum3;
		//出力
		System.out.println("平均(3で割った時):\b"+intNum4 / 3);

		//3.0で割った時の平均値
		//変数の初期化
		double doubleNum = (double)intNum4 / 3.0;
		//出力
		System.out.println("平均(3.0で割った時):\b"+doubleNum);

	}

}
