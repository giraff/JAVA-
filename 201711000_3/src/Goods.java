//예제 4-1
public class Goods {
		
	String name;
	int price;
	int numberOfStock;
	int sold;
	public Goods() {
	}
	
	public String getName() {return name;}

	public static void main(String[] args) {
		Goods Camera=new Goods();
		
		Camera.name="Nikon";
		Camera.price=400000;
		Camera.numberOfStock=30;
		Camera.sold=50;
		
		System.out.println("상품 이름 : "+Camera.name);
		System.out.println("상품 가격 : "+Camera.price);
		System.out.println("재고 수량 : "+Camera.numberOfStock);
		System.out.println("팔린 수량 : "+Camera.sold);
	}
	
}
