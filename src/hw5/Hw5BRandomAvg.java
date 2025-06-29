package hw5;
// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
public class Hw5BRandomAvg {
	public static void main(String[] args) {
		Hw5BRandomAvg ra = new Hw5BRandomAvg();
		ra.randomAvg(10);
	}
	
	public void randomAvg(int numberCount) {
		int[] arr = new int[numberCount];
		int avg = 0;
		
		if (numberCount < 1) {
			System.out.println("須選一個數字以上");
		} else {
			System.out.println("本次亂數結果:");
		
			for(int i = 0; i < numberCount; i++) {
				arr[i] = (int) (Math.random() * 101); // 0~100的亂數
				System.out.print(arr[i]+"\t"); // 印出本次取得的數值
				avg += arr[i]; // 加總
			}
			System.out.println("\n平均為"+avg/numberCount); // 印出亂數值平均
		}
	}
}
