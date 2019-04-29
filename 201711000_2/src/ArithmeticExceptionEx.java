import java.util.Scanner;
public class ArithmeticExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd=new Scanner(System.in);
		int divisor=0;
		int dividend=0;
		
		System.out.print("나뉨수를 입력:");
		dividend=rd.nextInt();
		System.out.print("나눗수를 입력:");
		divisor=rd.nextInt();

		try {
			System.out.println(dividend+"를"+divisor+"로 나누면 몫은 "+dividend/divisor);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionExample.main(ExceptionExample.java:14)
*/
}
