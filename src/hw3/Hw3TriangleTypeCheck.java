package hw3;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、
 * 等腰三角形、其它三角形或不是三角形，如圖示結果
 * 
 * 請輸入三個整數
 * 5 5 5
 * 正三角形
 * 
 * (提示：Scanner，三角形成立條件，判斷式if else)
 * (進階功能：加入直角三角形的判斷)
 */
public class Hw3TriangleTypeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
//		System.out.println(side1 + side2 + side3);
		Hw3TriangleTypeCheck tr = new Hw3TriangleTypeCheck();
		tr.getTriAngleType(side1, side2, side3); // 顯示是哪一種三角形
	}
	
	public void getTriAngleType(int side1, int side2, int side3) {
		// 如果任一邊為0
		if ((side1 <= 0) || (side2 <=0) || (side3 <=0)) {
			System.out.println("不是三角形");
		} else if ((side1==side2) && (side2==side3)) { // 如果三個邊都相等
			System.out.println("正三角形");
		} else if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
			System.out.println("等腰三角形"); // 如果任兩邊相等
		} else {
			int[] arr = {side1, side2, side3};
			Arrays.sort(arr);
			
			if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
					System.out.println("直角三角形"); // 畢氏定理 a平方+b平方 = c平方
			} else {
					System.out.println("其他三角形"); // 以上皆非
			}
			
//			ArrayList<Integer> arrList = new ArrayList();
//			// 將三個邊加入ArrayList
//			arrList.add(side1); 
//			arrList.add(side2);
//			arrList.add(side3);
//			arrList.sort(null); // 將邊做排序
//			
//			if (Math.pow((arrList.get(0)), 2) + Math.pow((arrList.get(1)), 2) 
//				== Math.pow((arrList.get(2)), 2)) {
//				System.out.println("直角三角形"); // 畢氏定理 a平方+b平方 = c平方
//			} else {
//				System.out.println("其他三角形"); // 以上皆非
//			}
		}
	}
	
}
