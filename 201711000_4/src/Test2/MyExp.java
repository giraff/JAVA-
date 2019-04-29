package Test2;
import java.util.Scanner;
public class MyExp {

	int base;
	int exp;
	
	public int getValue() {
		int s=1;
		for(int i=0;i<exp;i++) {
			s=s*base;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MyExp m=new MyExp();
		
		System.out.print("base:");
		m.base=sc.nextInt();
		System.out.print("exp:");
		m.exp=sc.nextInt();
		System.out.println(m.base+"의 "+m.exp+"승 ="+m.getValue());

	}

}
