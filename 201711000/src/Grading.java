/*예제 2-9 (1) 무한루프 ver.*/
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grd_Alp=null;
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {//sc의 다음값이 있으면 hasNext()

			int grade=sc.nextInt();
			if(grade>100||grade<0) grd_Alp="잘못 입력했습니다. 다시 입력하세요(0-100)";
			else if(grade>=90) grd_Alp="A";
			else if(grade>=80) grd_Alp="B";
			else if(grade>=70) grd_Alp="C";
			else if(grade>=60) grd_Alp="D";
			else if(grade>=0) grd_Alp="F";
			
			System.out.println("귀하의 학점:'"+grd_Alp+"'");
			System.out.println("성적 확인 종료를 원하면 ctrl+z를 누르세요.");
		}
		//hasNext()메소드에 의한 무한 루프는 ctrl+z 키를 입력하면 종료됩니다.
	}

}
