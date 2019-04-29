/*예제 2-5 대입 연산자와 증감 연산자*/
public class unaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opr=0;
		opr+=3;
		System.out.println(opr++);//출력:3  그후 , 4로 증가
		System.out.println(opr);//출력:4
		System.out.println(++opr);//출력:5, 5로증가 뒤 출력
		System.out.println(opr);//출력:5
		System.out.println(opr--);//출력:5,그후 4로 감소
		System.out.println(opr);//출력:4
		System.out.println(--opr);//출력:3, 3으로 감소 뒤 출력
		System.out.println(opr);//출력: 3
	}
}
