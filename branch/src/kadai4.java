import java.util.Scanner;

public class kadai4 {

	public static void main(String[] args) {
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		scan.close();
		//出力
		System.out.println("numA:"+numA);
		System.out.println("numB:"+numB);

		//正の整数の場合
		if(0 < numA && 0 < numB) {
			//約数の場合
			if(0 == numA % numB){
				System.out.println("numBはnumAの約数です");
			//約数でない場合
			}else {
				System.out.println("numBはnumAの約数ではありません");
			}
		//正の整数以外が入力された場合
		}else {
			System.out.println("正の整数を入力してください");
		}
	}

}
