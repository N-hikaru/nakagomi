
import java.util.Scanner;

public class kadai3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int intNum1 = scan.nextInt();
		int intNum2 = scan.nextInt();
		int intNum3 = scan.nextInt();

			System.out.println(intNum1);
			System.out.println(intNum2);
			System.out.println(intNum3);

				System.out.println("合計:\b"+intNum1+intNum2+intNum3);

        int intNum4 = intNum1+intNum2+intNum3;
        int intNum5 = intNum4/3;

        	System.out.println("平均(3割った時)"+intNum5);

        double doubleNum1 = intNum4;
        double doubleNum2 = doubleNum1/3.0;
        	System.out.println("平均(3.0で割った時)"+doubleNum2);

	}

}
