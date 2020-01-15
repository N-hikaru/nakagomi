
public class kadai3 {

	public static void main(String[] args) {
		String input = "文字列: ABCDEFG";
		System.out.println(input);

		StringBuffer output = new StringBuffer();

		//str1の文字列を逆にする
		for(int i = 0; i < input.length(); i++){
			output.insert(0,input.charAt(i));
		}
		System.out.println(output.toString());

	}

}
