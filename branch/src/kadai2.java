import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");

		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum1 = scan.nextInt();

		//受け取った数字が１桁の場合の処理
		if(intNum1 < 10)
			System.out.println("値:0"+intNum1);

		//受け取った数字が１桁でない場合の処理
		else {
			System.out.println("値:"+intNum1);
		}

	}
}