import java.util.ArrayList;

public class kadai1 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("北海道");
		alist.add("東北");
		alist.add("関東");
		alist.add("中部");
		alist.add("近畿");
		alist.add("中国");
		alist.add("九州");

		for(String language : alist) {
			System.out.println(language);

		}


	}

}
