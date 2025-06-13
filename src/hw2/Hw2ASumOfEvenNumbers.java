package hw2;

// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
public class Hw2ASumOfEvenNumbers {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) { // 如果數字(i)為偶數
				sum += i; // 將數字加總
			}
		}
		System.out.println("1～1000的偶數和=" + sum);
	}
}
