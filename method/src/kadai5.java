import java.util.ArrayList;

public class kadai5 {

	static boolean bool1;
	static boolean bool2;

	public static void main(String[] args) {

	//nullがないパターン
		ArrayList<String> notNullInData = new ArrayList<String>();
		notNullInData.add("北海道");
		notNullInData.add("東北");
		notNullInData.add("関東");
		notNullInData.add("中部");
		notNullInData.add("近畿");
		notNullInData.add("中国");
		notNullInData.add("九州");

		//参照渡し
		boolean bool1 = task5(notNullInData);
		if(bool1 == true) {
			System.out.println("---配列にnullがある場合---");
			System.out.println(bool1);
		} else {
			System.out.println("---配列にnullがない場合---");
			System.out.println(bool1);
		}


	//nullがあるパターン
		ArrayList<String> nullInData = new ArrayList<String>();
		nullInData.add("北海道");
		nullInData.add("東北");
		nullInData.add("関東");
		nullInData.add(null);
		nullInData.add("中部");
		nullInData.add("近畿");
		nullInData.add("中国");
		nullInData.add("九州");

		//参照渡し
		boolean bool2 = task5(nullInData);
		if(bool2 == true) {
			System.out.println("---配列にnullがある場合---");
			System.out.println(bool2);
		} else {
			System.out.println("---配列にnullがない場合---");
			System.out.println(bool2);
		}
	}


	//引数(notNullInData),(nullInData)がそれぞれdataに参照される
	static boolean task5(ArrayList<String> data){
			for (int i = 0; i <data.size();){
				if(data.get(i) != null) {
					i++;
				}else {
					return true;
				}
			}
			return false;
		}

}
