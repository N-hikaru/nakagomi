import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class kadai4 {

	public static void main(String[] args) {
		//配列の初期化
		int[] intNums = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};

		//ArrayList(alist)の宣言
		ArrayList<Integer> alist = new ArrayList<>();
		//ArrayList(blist)の宣言
		ArrayList<Integer> blist = new ArrayList<>();

		//mapの宣言
		Map<String, Integer> amap = new HashMap<>();
		//mapの宣言
		Map<String, Integer> bmap = new HashMap<>();

		//配列に格納されている数値を偶数、奇数に分ける
		int i;
		for(i = 0 ; i < intNums.length ; i++) {
			//偶数の場合、alistに格納してamapにラベル付け
			if(0 == intNums[i] % 2) {
				alist.add(intNums[i]);
				amap.put("偶数", intNums[i]);
			//奇数の場合、blistに格納してbmapにラベル付け
			}else{
				blist.add(intNums[i]);
				bmap.put("奇数", intNums[i]);
			};
		}
		System.out.print("{");
		System.out.println("偶数: =" + alist + ",");
		System.out.println("  奇数: =" + blist + "}");
	}
}
