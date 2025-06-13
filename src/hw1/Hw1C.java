package hw1;

// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
public class Hw1C {

	public static void main(String[] args) {
		int day = 0, hour = 0, min = 0, sec = 0, remainSec = 0;

		day = 256559 / (24 * 60 * 60); // 計算多少天
		remainSec = 256559 % (24 * 60 * 60); // 取得扣除天數後的剩餘秒數

		hour = remainSec / (60 * 60); // 計算剩餘秒數有多少小時
		remainSec = remainSec - hour * 60 * 60; // 取得扣除小時後剩餘秒數

		min = remainSec / 60; // 計算多少分鐘
		remainSec = remainSec - min * 60; // 取得最後剩餘秒數

		System.out.println("256559秒為 " + day + "天 " + hour + "小時 " + min + "分 " + remainSec + "秒");
	}
}
