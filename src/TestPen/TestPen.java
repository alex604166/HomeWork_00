package TestPen;

public class TestPen {

	public static void main(String[] args) {
		
		//實體化兩個物件做測試
		Pencil p1 = new Pencil("SKB", 10.0);
		InkBrush i1 = new InkBrush("Haha", 100);
		
		//宣告getPrice方法測試
		p1.write();
		p1.getBrand();
		p1.getPrice();
		i1.write();
		i1.getBrand();
		i1.getPrice();

	}

}
