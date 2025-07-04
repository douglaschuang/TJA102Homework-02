package hw7;

import java.io.*;

// 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

public class ObjectExport {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat cat = new Cat("Kitty");
		Dog dog = new Dog("Doggy");
		
		File fi = new File("C:\\data\\Object.ser");
		String path = fi.getParent();
		File pa = new File(path);
		if (!pa.isDirectory()) {
			pa.mkdir(); // 如果路徑不存在, 則產生該資料夾
			System.out.println(pa.getName()+ " was created.");
		}
		
		FileOutputStream fos = new FileOutputStream(fi);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat); // 寫入cat物件
		oos.writeObject(dog); // 寫入dog物件
		
		oos.close();
		fos.close();
	}
}
