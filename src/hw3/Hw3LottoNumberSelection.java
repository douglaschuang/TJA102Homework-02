package hw3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
 * 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
 * 的號碼與總數，如圖：
 * 
 * (提示：Scanner)
 * (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
 */
public class Hw3LottoNumberSelection {
	public static void main(String[] args) {
		int unlikeDigit = 0;
		int totalNumber = 0;
		int numberBreak = 6;
		int[] selectNumber = new int[49]; // 可選號碼清單

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你討厭哪個數字? (0~9的整數)");
		if (sc.hasNextInt()) {
			unlikeDigit = sc.nextInt();
		}
		if ((unlikeDigit > 9) || (unlikeDigit <= 0))
			System.out.println("數字必須是0~9的整數");
		else {

			Hw3LottoNumberSelection selNumber = new Hw3LottoNumberSelection();

			for (int count = 1; count <= 49; count++) {
				if (!(selNumber.isNumberUnlike(unlikeDigit, count))) {
					System.out.print(count + "\t");

					selectNumber[totalNumber] = count; // 將可選號碼加入陣列清單
					totalNumber++; // 計算總共有幾個號碼可選

					// 每6個數字換行
					if ((totalNumber % numberBreak) == 0) {
						System.out.println("");
					}
				}
			}

			System.out.println("總共有" + totalNumber + "個可選");

			int[] lottoNumbers = new int[6]; // 儲存亂數印出6個號碼且不得重複
			lottoNumbers = selNumber.getLottoNumbers(lottoNumbers, selectNumber, totalNumber);

			System.out.print("\n電腦選號: ");
			for (int count = 0; count < lottoNumbers.length; count++) {
				System.out.print(lottoNumbers[count] + "\t");
			}
		}
	}

	public boolean isNumberUnlike(int unlikeDigit, int number) {
		String s = String.valueOf(unlikeDigit); // 轉換不喜歡的數字為字串格式
		return String.valueOf(number).contains(s); // 回覆不喜歡的數字是否存在輸入的數字中
	}

	public int[] getLottoNumbers(int[] numberList, int[] selectNumber, int totalSelectNumber) {

		int[] lottoNumbers = new int[6];
		int pickNumber = 0;
		boolean found = false;
		int foundNumberCount = 0;
		do {
			found = false; // initialize
			pickNumber = selectNumber[(int) (Math.random() * totalSelectNumber)]; // 亂數選號
//			for (int x = 0; x < lottoNumbers.length; x++) {
//				if (lottoNumbers[x] == pickNumber) { // 號碼是否已經存在lottoNumbers清單中?
//					found = true; // 已選過
//					break;
//				}
//			}
			if (Arrays.binarySearch(lottoNumbers, pickNumber) > 0)
				found = true;
			else
				found = false;

			if (!found) { // 如果未選過, 則將號碼加入lottoNumbers清單中
				lottoNumbers[foundNumberCount] = pickNumber;
				foundNumberCount++; // 已選號碼計數+1
			}
		} while (foundNumberCount < 6); // 若已選6個則結束選號迴圈

		return lottoNumbers;
	}
}
