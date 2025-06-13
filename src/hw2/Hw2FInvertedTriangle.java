package hw2;

//請設計一隻Java程式，輸出結果為以下：
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class Hw2FInvertedTriangle {

	public static void main(String[] args) {

		for (int i = 10; i >= 1; i--) { // 從10倒數, 依序減少1
			for (int j = 1; j <= i; j++) // 從1遞增, 若小於i值, 則印出數字
				System.out.print(j + " ");

			System.out.println();
		}
	}
}
