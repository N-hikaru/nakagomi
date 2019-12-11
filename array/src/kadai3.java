import java.util.Random;

public class kadai3 {

	public static void main(String[] args) {

		System.out.print("[");
		//要素数5の配列
		int[] nums = new int[6];

		//ランダムに0～9の数字を6回出力させる
		Random random = new Random();
		int i1 = 1;
		for(int i2 = 0; i2 < 6 ; i2++) {
			//int Ran = random.nextInt(9);
			nums[i2]= random.nextInt(9);
				System.out.print(nums[i2]);
			//「,」を5回出力させる
			if(i1 < 6) {
				i1++;
				System.out.print(",");
			}
		}
		System.out.println("]");

		System.out.print("最大値: ");
		//最大値を求める
		//nums[0]が暫定的に最大値とする
		int max = nums[0];
		for (int i3 = 1 ; i3 < nums.length ; i3++) {
		    if (max < nums[i3]  ) {
		    	//比べた結果暫定の最大値より大きい場合には変数maxの数値を置きかえる
		        max = nums[i3];
		    }
		}
		System.out.println(max);

		System.out.print("最小値: ");
		//最小値を求める
		int min = nums[0];
		for(int i3 = 1 ; i3 < nums.length ; i3++) {
			if(nums[i3] < min) {
				min = nums[i3];
			}
		}
		System.out.println(min);
	}
}


