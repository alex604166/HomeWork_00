package hw1;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle one = new MyRectangle();
		MyRectangle two = new MyRectangle(10.0,20.0);
		one.setWidth(10);
		one.setDepth(20);
		System.out.println(one.getArea());
		System.out.println(two.getArea());
				
		MyRectangle three = new MyRectangle();
		
		System.out.println("==========================================================");

		System.out.println("本次隨機產生驗證碼為 :");
		three.genAuthCode();
	}

}
