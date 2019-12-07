
import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください:");
		//入力を待つ
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("桁数:"+str.length());

	}

}
