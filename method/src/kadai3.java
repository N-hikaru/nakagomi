
import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {

		//数値の入力を待つ
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		scan.close();

		//task3メソッドを呼ぶ
		double c = task3(a,b);

		System.out.println(String.format("%.1f", c));
	}

	public static double task3(double a, double b) {
		double c = a * b / 2;
			System.out.println("三角形の面積");

		//cの数値をmainメソッドに返す
		return c;

	}
}
