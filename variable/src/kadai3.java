
public class kadai3 {

	public static void main(String[] args) {

		//変換前
		//変数の初期化
		String str = "変換前";
		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L;
		//出力
			System.out.println(str);
			System.out.println(intNum);
			System.out.println(doubleNum);
			System.out.println(longNum);

		//変換後
		//変数の初期化
		String str2 = "変換後";
		long longNum2 = intNum;
		float floatNum2 = (float)doubleNum;
		double doubleNum2 = longNum;
		//出力
			System.out.println(str2);
			System.out.println(longNum2);
			System.out.println(floatNum2);
			System.out.println(doubleNum2);

	}

}
