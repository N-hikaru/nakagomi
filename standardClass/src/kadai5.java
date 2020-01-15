
public class kadai5 {

	public static void main(String[] args) {
		String original = "cat_mouse_mouse_cat_cat";
		String c = "cat";

		//文字列を分割(配列化)
		String[] strArray = original.split("_");
		int cats = 0;
		int mousus = 0;

		for(int i = 0; i < strArray.length; i++) {
			//strArrayの各要素と変数cが等しいか比べる
			if(strArray[i].equals(c)) {
				//等しい場合、catsをカウントさせる
				cats++;
			}else {
				//異なる場合、moususをカウントさせる
				mousus++;
			}
		}

		//moususの数とcatsの数を比べる
		if(mousus < cats) {
			System.out.println("catの方が多い");
		}else {
			System.out.println("mousuの方が多い");
		}
	}
}