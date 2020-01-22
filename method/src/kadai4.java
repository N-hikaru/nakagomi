

public class kadai4 {

	public static void main(String[] args) {

	//文字列のみの場合
	String str1 = "文字列1";
	String str2 = "文字列2";
	String str3 = overload(str1,str2);
		System.out.println(str3);

	//整数のみの場合
	int intNum1 = 10;
	int intNum2 = 12;
	int intNum3 = overload(intNum1,intNum2);
		System.out.println(intNum3);

	//少数のみの場合
	double dou1 = 5.5;
	double dou2 = 3.2;
	double dou3 = overload(dou1,dou2);
		System.out.println(dou3);
}




	//文字列が入力された場合
	public static String overload(String str1,String str2) {
		String str3 = str1 + str2;
		return str3;
	}

	//整数が入力された場合
	public static int overload(int intNum1,int intNum2) {
		int intNum3 = intNum1 + intNum2;
		return intNum3;
	}

	//少数が入力された場合
	public static double overload(double dou1,double dou2) {
		double dou3 = dou1 + dou2;
		return dou3;
	}
}
