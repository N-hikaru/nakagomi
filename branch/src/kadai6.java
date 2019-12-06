import java.util.Scanner;

public class kadai6 {

	public static void main(String[] args) {
		System.out.println("1から5までの数字を入力してください");
		//数字の入力を待つ
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();

		switch(intNum) {
		case 1:
			System.out.println("1->Ⅰ");
			break;
		case 2:
			System.out.println("2->Ⅱ");
			break;
		case 3:
			System.out.println("3->Ⅲ");
			break;
		case 4:
			System.out.println("4->Ⅳ");
			break;
		case 5:
			System.out.println("5->Ⅴ");
			break;
		default:
			System.out.println(intNum+"->unknown8");
		}
	}

}
