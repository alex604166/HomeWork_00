package TestPen;

public class Pencil extends Pen {
	public Pencil(String brand, double price) {
		super(brand, price);
	}

	// override價格方法
	public double getPrice() {
		System.out.println("price is:" + (super.getPrice() * 0.8));
		return super.getPrice();
	}
	
	public String getBrand() {
		System.out.println("brand is:" + super.getBrand());
		return super.getBrand();
	}

	// 實作抽方法write
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
