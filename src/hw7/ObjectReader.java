package hw7;
// 請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
// 型簡化本題的程式設計)
import java.io.*;

public class ObjectReader {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File fi = new File("C:\\data\\Object.ser");

		FileInputStream fis = new FileInputStream(fi);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				Object obj = ois.readObject(); // 讀取物件
				if (obj instanceof Cat) {
					((Cat) obj).speak(); // 如果物件是Cat類別
				} else if (obj instanceof Dog) {
					((Dog) obj).speak(); // 如果物件是Dog類別
				}

			}

		} catch (EOFException e) {
			System.out.println("Object read finished.");
		}
		ois.close();
		fis.close();
	}
}
