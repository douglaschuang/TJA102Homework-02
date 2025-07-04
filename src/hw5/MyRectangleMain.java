package hw5;
/*
 * 請設計一個類別MyRectangle：
 * (1) 有兩個double型態的屬性為width, depth
 * (2) 有三個方法：
 * void setWidth(double width): 將收到的引數指定給width屬性
 * void setDepth(double depth): 將收到的引數指定給depth屬性
 * double getArea(): 能計算該長方形的面積
 * (3) 有兩個建構子：
 * public MyRectangle(): 不帶參數也無內容的建構子
 * public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
 * • 請另外建立一個MyRectangleMain類別，此類別只有main方法
 * (1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
 * (2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
 */
public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle mr1 = new MyRectangle();
		MyRectangle mr2 = new MyRectangle(10.0, 20.0);
		
		mr1.setWidth(10.0);
		mr1.setDepth(20.0);
		
		System.out.println(mr1.getArea());
		System.out.println(mr2.getArea());
	}
}
