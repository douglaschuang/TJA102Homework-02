package hw5;
//• 建立父類別Pen
//• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
//• (2) 建構子設計：一個無參數與一個根據屬性而設計
//• (3) 定義Getter/Setter方法
//• (4) 宣告一個抽象方法write()
//• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//• (2) Pencil實際售價為定價8折，InkBrush為定價9折
//• (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
public class Hw5ExPenPoly {
	public static void main (String[] args) {
		Pen p1 = new Pencil();
		Pen p2 = new InkBrush();
		
		p1.setBrand("Pentel");
		p1.setPrice(20);
		
		p2.setBrand("Lion");
		p2.setPrice(50);
		
		p1.write();
		System.out.println(p1.getPrice());
		
		p2.write();
		System.out.println(p2.getPrice());
	
	}
}
