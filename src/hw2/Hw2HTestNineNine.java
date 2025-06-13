package hw2;

//請建立一個TestNineNine.java程式，可輸出九九乘法表
//一：使用for迴圈+ while迴圈
//二：使用for迴圈+ do while迴圈
//三：使用while迴圈+ do while迴圈
public class Hw2HTestNineNine {

	public static void main(String[] args) {

		int i = 1, j = 1;

		System.out.println("一：使用for迴圈+ while迴圈");
		// for + while
		for (i = 1; i <= 9; i++) {
			j = 1; // 重設j值
			while (j <= 9) {
				System.out.printf(i + "x" + j + "=%2d\t", i * j);
				j++;
			}
			System.out.println();
		}

		System.out.println("二：使用for迴圈+ do while迴圈");
		// for + do while
		for (i = 1; i <= 9; i++) {
			j = 1; // 重設j值
			do {
				System.out.printf(i + "x" + j + "=%2d\t", i * j);
				j++;
			} while (j <= 9);
			System.out.println();
		}

		System.out.println("三：使用while迴圈+ do while迴圈");
		// while + do while
		i = 1; // 重設i值
		while (i <= 9) {
			j = 1; // 重設j值
			do {
				System.out.printf(i + "x" + j + "=%2d\t", i * j);
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}
	}
}
