
public class Dog extends Animal {

	//課題４ フィールド「weight」の追加
	double weight;

	//課題４ コンストラクタ
	public Dog(String name, int age, double weihgt) {
		//親コンストラクタであるAnimalクラスを呼び出す
		super("ポチ",5);
		weight = 12.3;
	}

	public String getname() {
		return name;
	}
	public int getage() {
		return age;
	}
	public double getweight() {
		return weight;
	}


	//public static void main(String[] args) {


		//Dog dog1 = new Dog("ポチ", 0, 1.0);
		//Dog.Animal(String name, int age);


	//}
	/*	//コンストラクタ
		public Dog(String name, int age, double weihgt) {

			double weight = 1.0;
			//sleepメソッドを呼び出す
			sleep();
		}*/

		//課題４ 「run」メソッド
		public static void run(String name) {
			System.out.println(name + "は走った");
		}

		//課題４ Animal.sleepをオーバーライド
		public void sleep(){
			System.out.println(name + "は眠った");
		}

	}




