//예제 2-10
import java.util.Scanner;
public class GradingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("성적 입력:");
		char grd=sc.next().toUpperCase().charAt(0);//학점을 알파벳으로 받는 것, 
		switch(grd) {
		case'A':
		case'B':
			System.out.println("참 잘하셨습니다.");
			break;
		case'C':
		case'D':
			System.out.println("좀 더 노력하세요.");
			break;
		case'F':
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("학점을 다시 입력하세요,(A,B,C,D,F)");
			break;
			
		}
	}

}
