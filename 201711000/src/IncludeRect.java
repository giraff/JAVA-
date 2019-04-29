/*실습6.*/
import java.util.*;
public class IncludeRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String result=null;
		System.out.println("*****(100,100)(200,200)사각형 내부에 있는 점인지 여부 판별 *****");
		System.out.print("x:");
		int x=sc.nextInt();
		System.out.print("y:");
		int y=sc.nextInt();
		if(x>100&&x<200&&y>100&&y<200)
		{
			result="있습니다.";
		}
		else
			result="있지 않습니다.";
		System.out.println("입력한 좌표의 점은 사각형 내부에 "+result);

	}

}
