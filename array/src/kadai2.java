
public class kadai2 {

	public static void main(String[] args) {

		//要素数7のint型の配列を用意
		int intNum[] = new int[7];

		//7,6,5,4,3,2,1を出力させる処理
		//intNum[loop] = numberOfElements;
		int Value = 7;
		int loop = 0;
		int Comma = 1;

		//配列に要素を格納
		intNum[loop] = Value;
		//数字を出力させる処理
		for(loop = 6 ; 0 <= loop ; loop--) {
			System.out.print(Value);
			Value--;
			//「,」を出力させる処理
			if(Comma <= intNum.length - 1) {
				Comma++;
				System.out.print(",");
			}
		};
		System.out.println();

		//1,2,3,4,5,6,7を出力させる処理
		//intNum[loop] = numberOfElements;
		Value = 1;
		Comma = 1;
		//数字を出力させる処理
		for(loop = 0 ; loop < intNum.length ; loop++) {
			System.out.print(Value);
			Value++;
			//「,」を出力させる処理
			if(Comma <= intNum.length - 1) {
				Comma++;
			System.out.print(",");}
		};
	}
}

