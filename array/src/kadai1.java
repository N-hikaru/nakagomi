
public class kadai1 {

	public static void main(String[] args) {
		System.out.print("配列: [");
		//int型の配列に格納
		int[]  array = {4,9,19,5,8,21,42,64,73,18,2};

		//array[i]
		int i;
		//数字を出力させる処理
		for(i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]);
			//「,」を出力させる処理
			if(i < (array.length-1)){
				i++;
				System.out.print(",");
 			}
		}
		System.out.println("]");

        //合計を出力させる処理
		System.out.print("合計: ");
		int total = 0;
		for(int intNum : array) {
			total += intNum;
		}
		System.out.print(total);
	}



}



