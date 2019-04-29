/*예제 3-2 
 * while문을 이용하여 키보드에서 숫자를 입력 받아 
 * 입력 받은 모든 수의 평균을 출력하는 프로그램을 작성해보자. 
0이 입력되면 입력이 종료되고 평균을 구하여 출력한다.*/
import java.util.*;
public class _WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//선언 및 초기화
		float sum=0f;
		int input=0;
		int count=0;
		
		//반복문
		while((input=sc.nextInt())!=0) {
			sum+=input;
			count++;
		}
		//평균 출력
		System.out.println("입력된 수의 개수는 "+count+"개 이며, 평균은 "+(sum/count)+"입니다!");
		
		

	}

}
