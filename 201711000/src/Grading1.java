/*예제 2-9(2) 무한루프 없는 ver.*/
import java.util.Scanner;
public class Grading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String grd_Apb=null;
		
		System.out.print("성적 입력:");
		
		int grade=sc.nextInt();
		
		if(grade>=90) grd_Apb="A";
		else if(grade>=80) grd_Apb="B";
		else if(grade>=70) grd_Apb="C";
		else if(grade>=60) grd_Apb="D";
		else grd_Apb="F";
		System.out.println("당신의 학점은 "+grd_Apb+"입니다.");
	}
}
