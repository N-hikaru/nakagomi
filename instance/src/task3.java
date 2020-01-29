//課題３
public class task3 {

	public static void main(String[] args) {

		//Personクラスのhikaruオブジェクトを作る
		Person hikaru = new Person();

		hikaru.name = "中込光";
		hikaru.age = 26;

		//別(Person)クラスのmyProfileメソッドを呼び出す
		hikaru.myProfile();
		
	}
}
