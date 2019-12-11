
public class kadai2 {

	public static void main(String[] args) {

		//要素数7のint型の配列を用意
		int intNum[] = new int[7];

		//7,6,5,4,3,2,1を出力させる処理
		//intNum[i1] = i2;
		int i2 = 7;
		int i1;
		int i3 = 1;
		//数字を出力させる処理
		for(i1 = 6 ; 0 <= i1 ; i1--) {
			System.out.print(i2);
			i2--;
			//「,」を出力させる処理
			if(i3 <= intNum.length - 1) {
				i3++;
				System.out.print(",");
			}
		};
		System.out.println();

		//1,2,3,4,5,6,7を出力させる処理
		//intNum[i1] = i2;
		i2 = 1;
		i3 = 1;
		//数字を出力させる処理
		for(i1 = 0 ; i1 < intNum.length ; i1++) {
			System.out.print(i2);
			i2++;
			//「,」を出力させる処理
			if(i3 <= intNum.length - 1) {
			i3++;
			System.out.print(",");}
		};
	}
}

