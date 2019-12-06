import java.util.Scanner;

public class kadai7 {

	public static void main(String[] args) {
		System.out.println("病院に行く曜日を入力してください");
		System.out.println("【日曜,月曜,火曜,水曜,木曜,金曜,土曜】");
		//文字列の入力を待つ
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		//月曜から金曜の場合
		switch(str){
			case "月曜":
			case "月曜日":
			case "火曜":
			case "火曜日":
			case "水曜":
			case "水曜日":
			case "木曜":
			case "木曜日":
			case "金曜":
			case "金曜日":
				System.out.println("午前診療と午後診療があります");
				break;
		//土曜の場合
			case "土曜":
			case "土曜日":
				System.out.println("土曜は午前診療のみです");
				break;
		//日曜の場合
			case "日曜":
			case "日曜日":
				System.out.println("日曜は休診です");
				break;
		//それ以外の文字列が入力された場合
			default:
				System.out.println("入力を確認してください");
		}
	}

}
