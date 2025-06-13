package hw1;

// 請設計一隻Java程式，計算12，6這兩個數值的和與積
public class Hw1A {

	public static void main(String[] args) {
		int num1 = 12, num2 = 6, sum = 0, product = 0;

		// 和計算12+6
		sum = num1 + num2;
		System.out.println("12，6這兩個數值的和是: " + sum);

		// 積計算12*6
		product = num1 * num2;
		System.out.println("12，6這兩個數值的積是: " + product);
	}
}
