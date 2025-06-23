package hw4;
/*
 * • 有個一維陣列如下：
 * {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
 * 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
 * (提示：陣列，length屬性)
 * • 請建立一個字串，經過程式執行後，輸入結果是反過來的
 * 例如String s = “Hello World”，執行結果即為dlroW olleH
 * (提示：String方法，陣列)
 * • 有個字串陣列如下(八大行星)：
 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
 * 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
 * (提示：字元比對，String方法)
 */
public class Hw4AArrayPractice {
	public static void main(String[] args) {
		
// • 有個一維陣列如下：
//	 {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] arr1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double avg = 0;
		int sum1 = 0;
		
		for(int count=0; count<arr1.length; count++) {
			sum1+=arr1[count]; // 加總
		}
		
		avg=sum1 / arr1.length; // 取得數字平均值
		// 列出大於平均值的元素
		System.out.println("平均值為: "+avg);
		System.out.println("大於平均值的元素分別為: ");
		for(int count=0; count<arr1.length; count++) {
			if (arr1[count]>avg) {
				System.out.print(arr1[count]+"\t");
			}
		}
		
// • 請建立一個字串，經過程式執行後，輸入結果是反過來的
//	 例如String s = “Hello World”，執行結果即為dlroW olleH
		String s = "Hellow World";
		
		System.out.println("\n");
		for(int count=s.length()-1; count>=0; count--) {
			System.out.print(s.charAt(count));
		}
		
//• 有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//  請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int vowelCount = 0;
		
		for(int x = 0; x < planet.length; x++) {
			for(int y = 0; y < planet[x].length(); y++) {
				for(int z =0; z < vowel.length; z++) {
					if (planet[x].charAt(y) == vowel[z]) { // 比對並累計各個行星字串中的母音
						vowelCount++;
					}
				}
			}
		}
		
		System.out.println("");
		System.out.println("陣列中共有 " + vowelCount +" 個母音.");
	}
}
