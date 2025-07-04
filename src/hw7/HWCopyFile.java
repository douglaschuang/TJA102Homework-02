package hw7;

import java.io.*;

// 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
// 代表的檔案會複製到第二個參數代表的檔案
public class HWCopyFile {
	public static void main(String[] args) {
		HWCopyFile cf = new HWCopyFile();
		try {
				if (cf.copyFile(".\\bin\\hw7\\Data.txt", ".\\bin\\hw7\\Data1.txt")) {
					System.out.println("General File copied.");
				}
				
				if (cf.copyFileCh(".\\bin\\hw7\\Sample.txt", ".\\bin\\hw7\\Sample1.txt")) {
					System.out.println("Text File copied.");
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean copyFile(String sourceFileName, String targetFileName) throws FileNotFoundException {
		File sf = new File(sourceFileName);
		File tr = new File(targetFileName);
		
		FileInputStream ifs = new FileInputStream(sf);
		FileOutputStream fos = new FileOutputStream(tr);
		
		try {
				int i;
				while ((i=ifs.read()) != -1) {
					fos.write(i); // 逐byte讀取後寫入
				}
				
				fos.close();
				ifs.close();
				
				return true;		
		} catch (IOException e) {
			e.getStackTrace();
			return false;
		}
	}
	
	public boolean copyFileCh(String sourceFileName, String targetFileName) throws FileNotFoundException{
		try {
			
			FileReader fr = new FileReader(sourceFileName);
			FileWriter fw = new FileWriter(targetFileName);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String str;
			while ((str=br.readLine()) != null) {
				bw.write(str+'\n'); // 寫入並添加換行符號
			}
				
			bw.close();
			br.close();
				
			return true;		
		} catch (IOException e) {
			e.getStackTrace();
			return false;
		}		
		
	}
}
