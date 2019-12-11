
import java.util.Scanner;

public class kadai6{

	public static void main(String[] args) {
		System.out.println("1から5までの数字を入力してください");
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		scan.close();
		String c = "unknow";
		//1が入力された場合
		if(1 == intNum) {
			c = "Ⅰ";
		//2が入力された場合
		}else if(2 == intNum) {
			c = "Ⅱ";
		//3が入力された場合
		}else if(3 == intNum) {
			c = "Ⅲ";
		//4が入力された場合
		}else if(4 == intNum) {
			c = "Ⅳ";
		//5が入力された場合
		}else if(5 == intNum) {
			c = "Ⅴ";
		//1～5以外が入力された場合
		}else {
		}
			//出力
			System.out.println(intNum+"->"+c);
	}
}


