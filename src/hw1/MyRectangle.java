package hw1;

public class MyRectangle {
	double width;
	double depth;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return width * depth;
	}

	public MyRectangle() {

	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	public void genAuthCode() {
		//int[] arry = new int[8];
		char arry1;
		for (int i = 0; i < 8; i++) {
			int b = (int) (Math.random() * 123);
			if ((47 < b && b < 58) || (64 < b && b < 91) || (96 < b && b < 123)) {
				arry1 = (char)b;
				System.out.print(arry1);
			} else {
				i--;
			}

		}
	}
}
