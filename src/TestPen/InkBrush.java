package TestPen;

public class InkBrush extends Pen{
	public InkBrush(String brand, double price) {
		super(brand, price);
	}

	// override價格方法
	public double getPrice() {
		System.out.println("price is:" + (super.getPrice() * 0.9));
		return super.getPrice();
	}

	public String getBrand() {
		System.out.println("brand is:" + super.getBrand());
		return super.getBrand();
	}
	// 實作抽方法write
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
