//예제 4-3의 goods 클래스 변형
public class Good {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public Good() {} // 기본 생성자
	
	public Good(String na,int pr, int n, int sd){
		this.name=na;
		this.price=pr;
		this.numberOfStock=n;
		this.sold=sd;
	} 

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public int getSold() {
		return sold;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}
	
	
}
