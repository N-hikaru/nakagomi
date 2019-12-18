
import java.util.HashMap;

public class kadai3 {

	public static void main(String[] args) {
		//Hashmapの初期化
		HashMap< Integer,String > amap = new HashMap<>();
		HashMap< String,Integer > bmap = new HashMap<>();

		//要素の追加
		amap.put(1,"りんご");
		amap.put(2,"みかん");
		amap.put(3,"バナナ");
		amap.put(4,"メロン");

		bmap.put("りんご", 130);
		bmap.put("みかん", 120);
		bmap.put("バナナ", 98);
		bmap.put("メロン", 6000);

		System.out.println(amap.get(1) + ":" + bmap.get("りんご") + '円');
		System.out.println(amap.get(2) + ":" + bmap.get("メロン") + '円');
		System.out.println(amap.get(3) + ":" + bmap.get("みかん") + '円');
		System.out.println(amap.get(4) + ":" + bmap.get("バナナ") + '円');
	}
}
