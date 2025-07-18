package hw8;

// 請設計一個Train類別，並包含以下屬性：
// - 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
// - 目的地dest，型別為String - 票價price，型別為double
public class Train implements Comparable<Train> {
	private int number; // 班次
	
	private String type; // 車種
	private String start; // 出發地
	private String dest; // 目的地
	private double price; // 票價
	
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj != null && this.getClass() == obj.getClass()) {
			if (obj instanceof Train) {
				if (this.number == ((Train)obj).number) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + number;
		result = result * prime + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	@Override
	public int compareTo(Train o) {
		if (this.number > o.number) {
			return 1;
		} else if (this.number == o.number){
			return 0;
		} else {
			return -1;
		}

	}
}
