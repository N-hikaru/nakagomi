
public class Person {

	//「private」修飾子 自クラスのみからアクセス可
	private String name;
	private int age;

	//課題３ 「public」修飾子 すべてのクラスからアクセス可
	//「name」getter
	public String getName() {
		return this.name;
	}
	//「name」setter
	public void setName(String name) {
		this.name = name;
	}
	//「age」getter
	public int getAge() {
		return this.age;
	}
	//「age」setter
	public void setAge(int age) {
		this.age = age;
	}

	//課題２
	static int wallet = 0;

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}

	//課題１
	Person(){
		name = "hikaru";
		age = 26;
	}

	//課題２
	Person(int wallet){
		Person.wallet += wallet;
	}



}



/*	//名前
	private String name ="";
	//年齢
	private int age = 0;
	//お財布
	public static int wallet = 0;


	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	Person(int wallet){
		System.out.println(wallet);
		Person.wallet += wallet;
	}

	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
	//kadai3 getter
	public String getName() {
		return this.name;
	}
	//kadai3 getter
	public int getage() {
		return this.age;
	}
	//kadai3 setter
	public void setName(String name) {
		this.name = name;
	}
	//kadai3 setter
	public void setName(int age) {
		this.age = age;
	}
}*/
