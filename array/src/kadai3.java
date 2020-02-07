import java.util.Random;

public class kadai3 {

	public static void main(String[] args) {

		System.out.print("[");
		//要素数5の配列
		//int[] nums = new int[i]
		int[] nums = new int[6];

		//ランダムに0～9の数字を6回出力させる
		Random random = new Random();
		int Comma = 1;
		for(int elements = 0; elements < 6 ; elements++) {
			//int Ran = random.nextInt(9);
			nums[elements]= random.nextInt(9);
				System.out.print(nums[elements]);
			//「,」を5回出力させる
			if(Comma < (nums.length)) {
				Comma++;
				System.out.print(",");
			}
		}
		System.out.println("]");

		//最大値・最小値を求める
		//nums[0]が暫定的に最大値・最小値とする
		int max = nums[0];
		int min = nums[0];
		for (int s = 1 ; s < nums.length ; s++) {
		    if (max < nums[s]  ) {
		    	//比べた結果暫定の最大値より大きい場合には変数maxの数値を置きかえる
		        max = nums[s];
		    }
		    if(nums[s] < min) {
		    	//比べた結果暫定の最小値より小さい場合には変数minの数値を置き換える
				min = nums[s];
				}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
	}
}



