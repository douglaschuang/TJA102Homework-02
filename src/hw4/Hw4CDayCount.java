package hw4;

import java.util.Scanner;

/*
 * 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
 * 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
 * (提示1：Scanner，陣列)
 * (提示2：需將閏年條件加入)
 * (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
 */
public class Hw4CDayCount {
	public static void main(String[] args) {
		int year = 1;
		int month = 1;
		int day = 1;
		int totalDays = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("請分別輸入西元年, 月, 日, 共三個正整數:");
		if (sc.hasNextInt()) {
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();
		}

		// 檢查輸入資料正確性
		if (year <= 0) {
			System.out.println("年不可以小於或等於0");
		} else {
			Hw4CDayCount dc = new Hw4CDayCount();
			boolean isLeapYear = false;

			isLeapYear = dc.checkLeapYear(year); // 判斷是否為閏年(2月為29天)

			if (dc.checkMonthAndDay(month, day, isLeapYear)) { // 檢查月, 日的合理性(包含閏年)
				totalDays = dc.totalDays(year, month, day); // 取得基本天數(不考慮閏年)
				if ((isLeapYear) && month > 2) // 如果是閏年且月份大於2月, 則多加一天
					totalDays++;
				
				System.out.println("輸入的日期為該年第" + totalDays + "天");
			}
		}
	}

	public boolean checkMonthAndDay(int month, int day, boolean isLeapYear) {
		boolean checkResult = true;
		int[] monthday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		if (isLeapYear)
			monthday[1]=29; // 是閏年修改二月份天數
		
		if ((month <= 0) || month > 12 ) {
			System.out.println("月份不可以小於等於0或是大於12");
			checkResult = false;
		}
		
		if (day <= 0) {
			System.out.println("日不可以小於等於0");
			checkResult = false;
		}
		
		if (day > monthday[month-1]) {
			if (isLeapYear) {
				System.out.println("(閏年) 日不可大於輸入月份的最大天數("+monthday[month-1]+")");
			} else {
				System.out.println("(平年) 日不可大於輸入月份的最大天數("+monthday[month-1]+")");
			}
			checkResult = false;
		}
		
		return checkResult;
	}
		
	public int totalDays(int year, int month, int day) {
		int[] monthday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int daySum = 0;

		if (month == 1) { // 若輸入月份為1月, 直接回傳day
			return day;
		} else { // 依據月份-1加總天數
			for (int count = 0; count < (month - 1); count++) {
				daySum += monthday[count];
			}
			daySum += day;
			
			return daySum;
		}
	}

	public boolean checkLeapYear(int year) {
		boolean isLeapYear = false;

		// 閏年計算
		// 公元年份非4的倍數，為365天平年。
		// 公元年份為4的倍數但非100的倍數，為366天閏年。
		// 公元年份為100的倍數但非400的倍數（1700年、1800年及1900年）為平年。
		// 公元年份為400的倍數（1600年及2000年）為閏年。

		if ((year % 4) == 0) { // 年份為4的倍數
			isLeapYear = true;

			if ((year >= 100) && (year % 100) == 0) {
				isLeapYear = false; // 年份為4的倍數但是100的倍數為平年

				if ((year >= 400) && (year % 400) == 0) {
					isLeapYear = true; // 年份是400的倍數為閏年
				}
			}
		}

		return isLeapYear; // 回傳是否為閏年
	}
}
