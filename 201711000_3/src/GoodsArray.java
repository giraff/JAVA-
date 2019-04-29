//예제 4-3
import java.util.Scanner;
public class GoodsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Good[] goodsArray=new Good[3];
		//객체배열 생성
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("<세 개의 상품 정보 연달아 입력(이름_ 가격_ 재고수량_ 팔린수량) 입력후 두 번 엔터>");
		for(int i=0;i<goodsArray.length;i++) {
			System.out.println(i);
			String name=sc.next();
			int price=sc.nextInt();
			int n=sc.nextInt();
			int sold=sc.nextInt();
			goodsArray[i]=new Good(name,price,n,sold);
		}
		for(int i=0;i<goodsArray.length;i++) {
			goodsArray[i].setName("dd");
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumberOfStock()+" ");
			System.out.println(goodsArray[i].getSold()+" ");
		}

	}

}
