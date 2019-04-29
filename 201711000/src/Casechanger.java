/*실습1.*/
import java.util.Scanner;
public class Casechanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("영문자 하나 입력:");
		
		char Apb=sc.next().charAt(0);//문자 하나만 받고싶을 때 메소드 .charAt(인덱스값)
		if(Apb>=65&&Apb<=90) { 
			System.out.println("소문자로 변환:"+(char)(Apb+32));
		}
		else if(Apb>=97&&Apb<=122) {
			System.out.println("대문자로 변환:"+(char)(Apb-32));
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}

		
	}

}
