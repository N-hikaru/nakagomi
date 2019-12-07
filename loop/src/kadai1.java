
import java.util.Scanner;

public class kadai1 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください:");
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum1 = scan.nextInt();

		int intNum2 = 0;
		for(int i = 1;i <= intNum1;i++)
			intNum2 += i;
		//合計値を出力
		System.out.println("1～"+intNum1+"までの合計:"+intNum2);
	}

}
