package hw1;

// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
// 請用程式計算10年後，本金加利息共有多少錢(用複利計算，公式請自行google)
public class Hw1E {

	public static void main(String[] args) {

		// 複利計算公式: FV = PV * (1 + R)^n
		// FV: Future Value (未來本利和)
		// PV: Present Value (初始本金)
		// R: Rate (年利率)
		// n: 期數 (年)

		int n = 10;
		double FV = 0.0, PV = 1500000.0, rate = 0.02;

		FV = PV * Math.pow(1 + rate, n); // 依據複利計算公式算出未來本利和FV

		System.out.println("10年後本利和為" + (int) Math.ceil(FV) + "元");
	}
}
