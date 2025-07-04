package hw7;

import java.io.*;

/*
 * 請自行建立一個文字檔Sample.txt，內容如下：
 * 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
 * Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
 */
public class ReadFile {
	public static void main(String[] args) {
		try {
//			File fi = new File("C:\\TJA102_Workspace\\Homework-02\\bin\\hw7\\Sample.txt");
			File fi = new File(".\\bin\\hw7\\Sample.txt"); // 使用相對路徑
			FileReader fr = new FileReader(fi);
			int i = -1;
			int charCounter = 0;
			int lineCounter = 0;

			BufferedReader br = new BufferedReader(fr);
			while ((i = br.read()) != -1) {
				charCounter++; // 字數累加
			}
			
			br.close();
			fr.close();
			
			FileReader fr1 = new FileReader(fi);
			BufferedReader br1 = new BufferedReader(fr1);
			while ((br1.readLine() != null)) {
				lineCounter++; // 行數累加
			}
			
			System.out.println(
					fi.getName() + "檔案共有" + fi.length() + "位元組, " + charCounter + "個字元, " + lineCounter + "列資料.");

			br1.close();
			fr1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
