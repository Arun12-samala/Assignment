package Book;

public class Books {
	
	String name;
	Authors a=new Authors("name","Abc","m");
	double price;
	int quty;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuty() {
		return quty;
	}
	public void setQuty(int quty) {
		this.quty = quty;
	}
	public Books(String name, double price, int quty) {
		super();
		this.name = name;
		this.price = price;
		this.quty = quty;
	    this.a=a;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", a=" + a + ", price=" + price + ", quty=" + quty + "]";
	}
	

}