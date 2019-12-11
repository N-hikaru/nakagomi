import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {
		System.out.println("10以上の数字を入力してください");
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum1 = scan.nextInt();

		//入力数字が10未満の場合の処理
		if(intNum1 < 10) {
			intNum1 = intNum1 * 10;    //入力数字が10未満で10倍する
		}
		//出力
		System.out.println("値:"+intNum1);


	}

}
