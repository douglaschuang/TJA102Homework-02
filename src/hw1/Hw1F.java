package hw1;

//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class Hw1F {

	public static void main(String[] args) {

		System.out.println(5 + 5); // 皆為數字型態, 數字運算相加後, 再轉為文字輸出, 故輸出10
		System.out.println(5 + '5'); // '5'為字元, 換算ASCII後為53, 5+53=58, 再轉文字輸出58
		System.out.println(5 + "5"); // "5"為字串, 故視為字串相加, 所以為"5"+"5"=55
	}
}
