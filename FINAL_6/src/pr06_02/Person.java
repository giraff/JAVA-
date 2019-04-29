package pr06_02;
import java.util.Scanner;

public class Person {

	String p1,p2;
	Person(){}
	
	void IAmPlayer(){
		Scanner sc=new Scanner(System.in);
		System.out.println("<선수 이름 입력>");
		System.out.print("첫번째 선수 이름 입력:");
		this.p1=sc.nextLine();
		System.out.print("두번째 선수 이름 입력:");
		this.p2=sc.nextLine();
	}
}
