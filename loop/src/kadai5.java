
public class kadai5 {

	public static void main(String[] args) {
		//1の段から9の段まで
		for(int i1 = 1;i1 <= 9;i1++) {
			int i2 = 1;
			while(i2 <= 9) {
				int kake;
				kake = i1 * i2;
				//掛ける数字を1大きくする
				i2++;

				//1桁の時は数字の前後に半角スペースを付けて出力
				if(kake < 10) {
					System.out.print(" "+kake+" ");
				//2桁の時は数字の後に半角スペースを付けて出力
				}else {
					System.out.print(kake+" ");
				}
			}
			System.out.println();
		}
	}

}
