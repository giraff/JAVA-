//예제 2-11
import java.util.Scanner;
public class GradingIfSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String grd_Apb=null;
		int grade=sc.nextInt();
		switch(grade/10) {
		case 10:
		case 9:
			grd_Apb="A";
			break;
		case 8:
			grd_Apb="B";
			break;
		case 7:
			grd_Apb="C";
			break;
		case 6:
			grd_Apb="D";
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0://폭포형
			grd_Apb="F";
			break;
		default:
			grd_Apb="다시입력하세요.(0-100)";
			break;
		}
		System.out.println("귀하의 학점:"+grd_Apb);
	}

}
