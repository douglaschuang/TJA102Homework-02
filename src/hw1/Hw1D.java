package hw1;

// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class Hw1D {

	public static void main(String[] args) {
		final double PI = 3.1415;
		double circleArea = 0, circumference = 0;

		circleArea = PI * 5 * 5; // PI * r * r, r=半徑
		circumference = 2 * 5 * PI; // 2 * r * PI, r=半徑

		System.out.printf("半徑為5的圓面積=%.4f", circleArea);
		System.out.printf(", 圓周長=%.4f%n", circumference);

	}
}
