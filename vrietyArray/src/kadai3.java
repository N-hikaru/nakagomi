
import java.util.HashMap;

public class kadai3 {

	public static void main(String[] args) {
		HashMap< String,Integer > amap = new HashMap<>();
		amap.put("りんご", 130);
		amap.put("みかん", 120);
		amap.put("バナナ", 98);
		amap.put("メロン", 6000);

		System.out.println("りんご:"+ amap.get("りんご") + '円');
		System.out.println("メロン:"+ amap.get("メロン") + '円');
		System.out.println("みかん:"+ amap.get("みかん") + '円');
		System.out.println("バナナ:"+ amap.get("バナナ") + '円');
	}
}
