package hw2;

//請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Hw2GLetterTriangle {

	public static void main(String[] args) {
		final char letter = 'A';
		char newLetter = 'A';

		while (newLetter <= 'F') {
			for (int count = 0; count <= newLetter - letter; count++)
				System.out.print(newLetter);
			System.out.println();
			newLetter += 1;
		}
	}
}
