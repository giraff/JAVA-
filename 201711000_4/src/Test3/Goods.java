package Test3;

class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	//생성자+setter
	void Goods(String n,int p,int nStock,int s){
		name=n;
		price=p;
		numberOfStock=nStock;
		sold=s;
	}
	
	//getter
	String getName() {
		return this.name;
	}
	int getPrice() {
		return this.price;
	}
	int getNumberOfStock() {
		return this.numberOfStock;
	}
	int getSold() {
		return this.sold;
	}
}
