
public class kadai1 {

	public static void main(String[] args) {
		String str1 = " tech-compass ";
		System.out.println("変更前:" + str1);

		//半角スペースを消す
		String str2 = str1.trim();

		//小文字を大文字に換える
		System.out.println("変更後:" + str2.toUpperCase());

	}

}
