/*실습 3.*/
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		//세 변을 입력, 삼각형을 이루는지 (길이가 긴 한 변을 제외한 나머지 두변의 길이합이 남은 한 변보다 길다.)
		System.out.println("연속 세 변 입력: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b) {
			if(a>c) {
				if(a>b+c) System.out.println("삼각형이 아니다.");
				else System.out.println("삼각형이다.");
			}
			else {
				if(c>a+b) System.out.println("삼각형이 아니다.");
				else System.out.println("삼각형이다.");
			}
		}
		else {
			if(b>c) {
				if(b>a+c) System.out.println("삼각형이 아니다.");
				else System.out.println("삼각형이다.");
			}
			else {
				if(c>(a+b)) System.out.println("삼각형이 아니다.");
				else System.out.println("삼각형이다.");
			}
		}
	}

}
