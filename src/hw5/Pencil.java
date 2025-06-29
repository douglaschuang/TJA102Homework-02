package hw5;

public class Pencil extends Pen {
	public void write() {
		// 實作抽象方法write
		System.out.println("削鉛筆再寫");
	}
	
	public int getPrice() {
		return (int) (super.getPrice() * 0.8); // Pencil實際售價為定價8折
	}
}
