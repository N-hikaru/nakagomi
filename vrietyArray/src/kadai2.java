import java.util.ArrayList;

public class kadai2 {

	public static void main(String[] args) {
		int[] intNums = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
		//奇数のArrayList
		ArrayList<Integer> alist = new ArrayList<>();
		//偶数のArrayList
		ArrayList<Integer> blist = new ArrayList<>();

		int i;
		for(i = 0 ; i < intNums.length ; i++ ) {
			int i2 = intNums[i] % 2;
			//奇数の場合 この時点で格納される
			if(i2 != 0) {
				//Ex.intNums[0] = 21,21はint型⇒ArrayListはint型を指定
				alist.add(intNums[i]);
			//偶数の場合 この時点で格納される
			}else {
				blist.add(intNums[i]);
			}
		}
		//奇数のArrayListを出力させるだけ
		int a = 0;
		System.out.print("奇数: [");
		for(int language : alist) {
			System.out.print(language);
			a++;
			//alist.size() → Alistの要素数を調べる
			if(a < alist.size()) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		//偶数のArrayListを出力させるだけ
		int b = 0;
		System.out.print("偶数: [");
		for(int language : blist) {
			System.out.print(language);
			b++;
			//blist.size() → Alistの要素数を調べる
			if(b < blist.size()) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
}

