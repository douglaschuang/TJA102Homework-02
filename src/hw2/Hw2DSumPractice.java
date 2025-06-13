package hw2;

//請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
public class Hw2DSumPractice {
	public static void main(String[] args) {
		int sum = 0, count = 1;

		while (sum < 100) { // 值小於100時計算
			if (count % 2 == 1) { // 若遞增計數值為奇數
				sum += count;
				System.out.print(sum + " ");
			}
			count++; // 遞增計數值
		}
	}

}
