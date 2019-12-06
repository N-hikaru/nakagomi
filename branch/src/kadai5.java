import java.util.Scanner;

public class kadai5 {

	public static void main(String[] args) {
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		//出力
		System.out.println("numA"+numA);
		System.out.println("numB"+numB);
		System.out.println("numC"+numC);

		if(numA <= numB){
			if(numB <= numC)
			System.out.println("最大値:"+numC);
			else
			System.out.println("最大値:"+numB);
		    }
		else
			System.out.println("最大値:"+numA);
		}
	}

