package lab6;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		char op;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a=sc.nextInt();
		b=sc.nextInt();
		op=sc.next().charAt(0);
		
		switch(op) {
		case '+':
			Add add=new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case '-':
			Sub sub=new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case '*':
			Mul mul=new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case '/':
			Div div=new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		
	}

}
