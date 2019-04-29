/*예제 2-3
 * 수를 입력하여 시간 분 초로 나누어 출력*/
import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//scanner 객체 생성
		
		int time,hour,min,sec;
		
		System.out.print("정수를 입력하세요:");
		
		time=sc.nextInt();//수 입력 
		//수식
		hour=(time/60)/60; 
		min=(time%3600)/60;
		sec=(time%3600)%60;
		
		System.out.println(time+"초는 "+hour+"시간,"+min+"분,"+sec+"초입니다.");
	}
}
