
import java.util.Scanner;

public class kadai4 {

	public static void main(String[] args) {
		//キーボードからの入力を待つ
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		System.out.println("検索したい文字: " + input);

		String original = "ABCDGOPQRSYZ";

		//変数originalの文字列の中から変数inputの文字列を検索
		//見つかった場合、変数resultに0を返す
		//見つからなかった場合、変数resultに-1を返す
		int result = original.indexOf(input);

		if(result == 0) {
			System.out.println(original + "は" + input + "を含む");
		}else {
			System.out.println(original + "は" + input + "を含まない");
		}

	}

}
