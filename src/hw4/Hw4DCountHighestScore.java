package hw4;

// 班上有8位同學，他們進行了6次考試結果
// 請算出每位同學考最高分的次數
public class Hw4DCountHighestScore {
	public static void main(String[] args) {

		int[][] scores = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } 
				};

		int[] student = new int[8]; // 儲存每個學生最高分的次數
		int highestIndex = 0; // 紀錄該次分數最高的學生index

		for (int x = 0; x < scores.length; x++) {
			highestIndex = 0; // Initialize
			for (int y = 0; y < scores[x].length; y++) {
				if (scores[x][y] > scores[x][highestIndex]) {
					highestIndex = y; // 比大小, 紀錄該次分數最高的學生Index
				};
			}
			student[highestIndex]++; // 將該次分數最高的學生Index次數加1
		}

		for (int i = 0; i < student.length; i++) // 依學生號印出每位考最高分的次數
			System.out.print((i + 1) + "號:" + student[i] + "次\n");
	}
}
