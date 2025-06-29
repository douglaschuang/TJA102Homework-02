package hw5;

import java.util.Scanner;

// 請設計一個方法為starSquare(int width, int height)，
// 當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
public class Hw5APrintStarSquare {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = 0;
		int height = 0;
		
		System.out.println("請分別輸入寬與高");
		if (sc.hasNextInt()) {
			width = sc.nextInt();
			height = sc.nextInt();
		}

		Hw5APrintStarSquare ps = new Hw5APrintStarSquare();
		ps.starSquare(width, height);
	}
	
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
