package Test3;
import java.util.Scanner;
public class GoodsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods[] goods= new Goods[3];
		Scanner sc= new Scanner(System.in);
		
		//객체 배열에서 객체 생성
		for(int i=0; i<goods.length;i++) {
			goods[i]=new Goods();
		}
		
		//객체 하나씩 상품 입력
		for(int i=0;i<goods.length;i++) {
			String name=sc.next();
			int price=sc.nextInt();
			int nStock=sc.nextInt();
			int sold=sc.nextInt();
			
			goods[i].Goods(name,price,nStock,sold);
		}
		//객체 하나씩 상품 출력
		for(int i=0;i<goods.length;i++) {
			System.out.println(goods[i].getName()+" "+goods[i].getPrice()+" "+goods[i].getNumberOfStock()+" "+goods[i].getSold());
		}
	}

}
