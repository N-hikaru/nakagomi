import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();

		//0の場合
		if(0 == intNum)
			System.out.println("入力された数字は0です。");

		//正の整数の場合
		else if(intNum > 0)
			System.out.println("入力された数字は正の整数です。");

		//負の整数の場合
		else
			System.out.println("入力された数字は負の整数です。");

	}

}
