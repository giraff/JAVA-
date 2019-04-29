/*실습9. 
 * 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받는다. 
 * 그리고 실수 값으로 다른 점(x, y)를 입력받아 이 점이 원에 내부에 있는 판별하여 출력하라.*/
import java.util.*;
public class IncludeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String result=null;
		//원의 중심과 반지름, 또 다른 점 입력.(실수로)
		System.out.println("*****원 내부에 있는 점인지 여부 판단*****");
		System.out.print("원의 중심과 반지름 입력>>");
		double cen1=sc.nextDouble();
		double cen2=sc.nextDouble();
		double rad=sc.nextDouble();
		System.out.print("점 입력>>");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		
		/*점과 원의 중심 사이 거리(distance)가 원의 반지름(rad)보다 크면(r<d) 점은 원의 내부에 있지 않다.
		 * 점과 원의 중심 사이 거리(distance)가 원의 반지름(rad)보다 작으면(r>d) 점은 원의 내부에 있다.
		 * distance와 rad가 같으면 점은 원에 접한다.*/
		
		//'점과 원의 중심 사이 거리'의 '제곱'
		double distance=(cen1-x1)*(cen1-x1)+(cen2-y1)*(cen2-y1);
		
		if(distance<(rad*rad)) 
			result="안에 있다.";
		else if(distance==(rad*rad)) 
			result="에 점이 접한다(내부에 있지 않다.)";
		else 
			result="안에 있지 않다.";
		
		System.out.println("점 ("+x1+","+y1+")은 원 "+ result);
		
	}

}
