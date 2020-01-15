
import java.util.Calendar;

public class kadai7 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();



		//現在時刻
		System.out.print("現在日時: ");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println();

		//1週間後に設定
		cal.add(Calendar.DAY_OF_MONTH, 7);
		System.out.print("１週間後: ");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println();

		//１年後に設定
		cal.add(Calendar.DAY_OF_MONTH, -7);
		// (cal.get(Calendar.YEAR)＝実行年に１年追加
		cal.set(Calendar.YEAR, (cal.get(Calendar.YEAR) + 1));
		System.out.print("１年後:   ");
		System.out.print(cal.get(Calendar.YEAR) + "年");
		System.out.print(cal.get(Calendar.MONTH) + 1 + "月");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH) + "日");

		//曜日
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
	    case 1:
	    	System.out.print("日曜日");
	        //日曜日
	        break;
	    case 2:
	    	System.out.print("月曜日");
	        //月曜日
	        break;
	    case 3:
	    	System.out.print("火曜日");
	        //火曜日
	        break;
	    case 4:
	    	System.out.print("水曜日");
	        //水曜日
	        break;
	    case 5:
	    	System.out.print("木曜日");
	        //木曜日
	        break;
	    case 6:
	    	System.out.print("金曜日");
	        //金曜日
	        break;
	    case 7:
	    	System.out.print("土曜日");
	        //土曜日
	        break;
		}
	}
}