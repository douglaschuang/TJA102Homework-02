package hw1;

// 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
public class Hw1B {

	public static void main(String[] args) {
		final int dozent = 12;
		int totalDozent = 0, remainEgg = 0;

		totalDozent = 200 / dozent;
		remainEgg = 200 % dozent;
		System.out.println("200顆蛋共是" + totalDozent + "打又" + remainEgg + "顆");
	}
}
