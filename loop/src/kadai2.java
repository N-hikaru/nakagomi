import java.util.Scanner;

public class kadai2 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください:");
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum1 = scan.nextInt();

		int intNum2 = 0;
		for(int i = 1;i <= intNum1;i++) {
		intNum2 += i;		//合計値を算出
		System.out.print(i);
		    //数字が出力され終わる1つ前で「＋」が出力されないようにする
			if(i < intNum1)
			System.out.print('+');}

		//ループを抜けた後
		System.out.print('=');
		System.out.print(intNum2);
		}
	}
