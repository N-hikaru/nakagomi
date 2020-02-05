
import java.util.Scanner;

public class kadai4 {

	public static void main(String[] args) {
		System.out.print("正の整数を入力してください: ");
		Scanner scan = new Scanner(System.in);
		int intNum1 = scan.nextInt();
		scan.close();
			System.out.print(intNum1+ "の約数: ");

		//最初は1で割る
			//約数の出力
			for(int i = 1 ; i <= intNum1 ; i++) {
				int intNum2;
				intNum2 = intNum1 % i;
				if(intNum2 == 0) {
					System.out.print( i);
					//「,」の出力
					int intNum3 = intNum1 / 2;
					if(i <= intNum3) {
						System.out.print(',');
					}
				}
			}
	}
}
