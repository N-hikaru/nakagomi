
import java.util.Scanner;

public class kadai5 {

	public static void main(String[] args) {

		//1
		System.out.println("ノートPCの値段: "+89800+'円');

		//2
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		scan.close();
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str1 + str2);
	}

}
