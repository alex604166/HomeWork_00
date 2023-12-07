package TestPen;

public abstract class Pen {
	private String brand;
	private double price;

	public Pen() {

	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(String brand) {
		this.brand = brand;
	}

	public abstract void write();
}
