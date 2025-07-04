package hw7;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
// append功能讓每次執行結果都能被保存起來)
public class AppendNumbers {
	public static void main(String[] args) {
		HashSet<Integer> se = new HashSet();
		
		while (se.size()<10) { // 如果HashSet元素未滿10個
			se.add((int)(Math.random()*1000)+1); // 亂數產生1個1~1000的整數, 並且加入HashSet中
		}
		
		try {
			File fi = new File(".\\bin\\hw7\\Data.txt");
			FileWriter fw = new FileWriter(fi, true); // 預定將資料以append方式寫入檔案
//			PrintWriter pw = new PrintWriter(fw);
//			pw.write(se.toString()+'\n');
			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write(se.toString()+'\n');  // 將HashSet的內容寫入檔案
			
			String str ="";
			Iterator<Integer> it = se.iterator(); // 使用iterator讀取HashSet
			while (it.hasNext()) {
				str = str + it.next().toString() + ',';
			}
			str=str.substring(0, str.length()-1); // 移除最後一個","
			bw.write(str+'\n');
			
//			pw.close();
			bw.close();
			fw.close();
			
		} catch (IOException e){
			e.getStackTrace();
		}
	}
}
