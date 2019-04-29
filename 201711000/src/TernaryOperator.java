/*예제 2-6 조건 연산자 사용*/
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=5;
		
		System.out.println("두 수의 차는 "+((a>b)?(a-b):(b-a)));
		//a>b라면 a-b를 출력하고, a>b가 아니라면(즉, a<=b) b-a를 출력한다.
	}
}
