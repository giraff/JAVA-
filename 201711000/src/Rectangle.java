/*실습4.*/
/* 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. 
 * (50,50)과 (100,100)의 두 점으로 이루어진 직사각형이 있다고 하자. 
 * 이때 키보드로부터 다른 직사각형을 구성하는 두 점 (x1, y1), (x2,y2)를 
 * 입력 받아 두 개의 직사각형이 서로 충돌하는지 판별하는 프로그램을 작성하라.
*/
import java.util.*;//Scanner 클래스를 사용하기 위해 추가
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result=null;
		Scanner sc= new Scanner(System.in);//Scanner 클래스의 객체 생성 
		System.out.println("**** 직사각형 충돌 실험 ****");
		System.out.print("(x1,y1):");
		int x1=sc.nextInt();int y1=sc.nextInt();
		System.out.print("(x2,y2):");
		int x2=sc.nextInt();int y2=sc.nextInt();
		
		/*사각형 충돌 알고리즘
		 * 주어진 사각형은 (50,50)(100,100)이다. 
		 * 입력된 사각형의 왼쪽 모서리는(LEFT=x1) 주어진 사각형의 오른쪽 모서리(B.Right=100(x2))를 넘지않아야한다. x1<100
		 * 입력 사각형의 오른쪽 모서리는(RIGHT=x2)주어진 사각형의 왼쪽 모서리(B.LEFT=50(x1))를 넘어야 한다. x2>50
		 * 입력 사각형의 윗쪽 모서리는(TOP=y1) 주어진 사각형의 아랫쪽 모서리(B.BOTTOM=100(y2))을 넘지 않아야 한다. y1<100
		 * 입력 사각형이 아랫쪽 모서리는(BOTTOM=y2)주어진 사각형의 위쪽 모서리(B.TOP=50(y1))을 넘어야 한다. y2>50*/
		if(x1<100&&x2>50&&y1<100&&y2>50)
		{
			result="충돌합니다.";
		}
		else {//위 네 조건을 동시에 만족하지 않을 땐 충돌하지 않는다.
			result="충돌하지 않습니다.";
		}
		
		System.out.println("두 사각형은 "+result);
		
	}

}
