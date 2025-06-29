package hw5;

public abstract class Pen {
	private String brand;
	private int price;
	
	public Pen() {
		
	};
	
	public Pen(String brand, int price) {
		setBrand(brand);
		setPrice(price);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public abstract void write();
}
