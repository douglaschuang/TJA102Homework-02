package hw6;

import java.util.InputMismatchException;

/*
 * 請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
 * 方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。CalTest.java執行後，使用者可
 * 以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
 * 1. x與y同時為0，(產生自訂的CalException例外物件)
 * 2. y為負值，而導致x的y次方結果不為整數
 * 3. x與y皆正確情況下，會顯示運算後結果
 */

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator ca = new Calculator();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		boolean fi = false;

		while (true) {
			// 持續詢問x, y的值, 直到成功取得合適的整數算出x的y次方為止
			while (true) {
				System.out.println("請輸入x的值: ");
				if (sc.hasNextInt()) {
					x = sc.nextInt();
					break; // 成功取得x的整數值, 跳出迴圈
				} else {
					System.out.println("輸入格式不正確, 請重新輸入.\n");
					sc.next(); // 非整數型態, 清除錯誤輸入
				}
			}
	
			while (true) {
				System.out.println("請輸入y的值: ");
				if (sc.hasNextInt()) {
					y = sc.nextInt();
					break; // 成功取得x的整數值, 跳出迴圈
				} else {
					System.out.println("輸入格式不正確, 請重新輸入.\n");
					sc.next(); // 非整數型態, 清除錯誤輸入
				}
			}
	
			try {
				if ((x == 0) && (y == 0)) {
					throw new CalException("0的0次方沒有意義\n");
				} else if (y < 0) {
					throw new CalException("次方為負值，結果回傳不為整數\n");
				} else {
					int result = ca.powerXY(x, y);
					System.out.println(x + "的" + y + "次方等於" + result);
					break; // 成功算出x的y次方, 結束整個輸入迴圈
				}
			} catch (CalException e) {
				System.out.print(e.getMessage()); 
			}
		}
	}
}
