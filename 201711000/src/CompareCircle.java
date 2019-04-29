/*실습8. 
 * 키보드로부터 원의 정보인 원의 중심을 나타내는 한 점과 반지름을 입력받는다. 
 * 두 개의 원을 입력받고 두 원이 겹치는지 판단하여 출력하여라*/
import java.util.*;
public class CompareCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,y1,x2,y2,rad1,rad2;
		String result=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("****원과 원 충돌 시험****");
		System.out.print("첫 번째 원의 중심(x1,y1)과 반지름 입력>>");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		
		rad1=sc.nextDouble();
		System.out.print("두 번째 원의 중심(x2,y2)과 반지름 입력>>");
		x2=sc.nextDouble();
		y2=sc.nextDouble();

		rad2=sc.nextDouble();
		
		//두 원의 중심간의 거리보다 두 원의 반지름의 합이 크면 충돌한다.
		//중심간의 거리의 제곱
		double leng1=x2-x1;
		double leng2=y2-y1;
		double distance=(leng1*leng1)+(leng2*leng2);
		
		//두 원의 반지름의 합의 제곱.
		double radsum=(rad1+rad2)*(rad1+rad2);
		
		if(radsum>distance) {
			result="충돌합니다.(서로 겹친다)";
		}
		else
			result="충돌하지 않습니다.(겹치지 않는다)";
		System.out.println("두 원은 "+result);
		

	}

}
