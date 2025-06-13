package hw2;

//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class Hw2EListNumbersWithout4 {
	public static void main(String[] args) {

		int notLikeNumCount = 0;

		System.out.print("可以選擇的數字有:");
		for (int i = 1; i <= 49; i++) { // 依序從1~49去判斷
			switch (i) {
			case (4): // 如果=4
				notLikeNumCount++;
				break;
			case (14): // 如果=14
				notLikeNumCount++;
				break;
			case (24): // 如果=24
				notLikeNumCount++;
				break;
			case (34): // 如果=34
				notLikeNumCount++;
				break;
			default:
				if (i / 10 == 4) // 如果十位數是4
					notLikeNumCount++;
				else
					System.out.print(i + " "); // 都非含有4的數字則列印出
			}
		}

		System.out.println("\n總共有" + (49 - notLikeNumCount) + "個"); // 印出總共有多少個數字可選
	}
}
