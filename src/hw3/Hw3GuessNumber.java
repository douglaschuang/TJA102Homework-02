package hw3;

import java.util.Scanner;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

public class Hw3GuessNumber {
	public static void main(String[] args) {
		int finalNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("要猜0~多少的整數呢?");
		if (sc.hasNextInt()) {
			finalNumber = sc.nextInt();
		}
		
		System.out.println("開始猜數字吧! 0~"+finalNumber);
		
		int correctNumber = (int) ((finalNumber+1) * Math.random()); // 亂數產生0~final的數字
		while (true) {
			if (sc.hasNextInt()) {
				int inputNumber = sc.nextInt(); // 取得輸入的整數
				
				if ((inputNumber < 0) || (inputNumber > finalNumber)) { // 不是範圍內整數, 重跑廻圈
					System.out.println("請輸入0~finalNumber之間的整數, 再輸一次:");
					continue;
				}
					
				if (inputNumber == correctNumber) { // 輸入數字等於亂數產生的數字
					System.out.println("答對了! 答案就是"+correctNumber);
					break;
				} else {
					System.out.print("猜錯囉! "); // 答案猜錯, 判斷數字比正確數字大或小給予提示
					if (inputNumber < correctNumber) {
						System.out.println("數字再大一點");
					} else {
						System.out.println("數字再小一點");
					}
				}
			}
		}
	}
}
