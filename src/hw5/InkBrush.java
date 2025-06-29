package hw5;

public class InkBrush extends Pen {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("沾墨汁再寫");
	}
	
	public int getPrice() {
		return (int) (super.getPrice()*0.9);  // InkBrush為定價9折
	}
}
