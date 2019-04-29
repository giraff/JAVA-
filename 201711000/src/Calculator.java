/*실습10.*/
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String op=null;//연산자 + - % /
		double result;

		System.out.println("*****사칙연산 계산*****");
		System.out.print("식 입력 [빈칸(=space bar)으로 피연산자와 연산자 분리]:");
		//입력(빈칸 기준)
		double oped1=sc.nextDouble();
		op=sc.next();
		double oped2=sc.nextDouble();
	
		switch(op) {
		case "+":
			System.out.println(oped1+oped2);
			break;
		case "-":
			System.out.println(oped1-oped2);
			break;
		case "/":
			if(oped2==0.0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			else {
				System.out.println(oped1/oped2);
				break;
			}
		case "%":
			if(oped2==0.0) { 
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			else {
				System.out.println(oped1%oped2);
				break;
			}
		default:
			System.out.println("[error, 연달아 세 번만 입력하고 연산자로는 '+','-','/','%' 중 하나 입력]");
			break;
		
		}
	}
}