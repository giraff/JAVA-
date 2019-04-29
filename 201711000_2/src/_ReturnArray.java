/* 예제 3-12
 * 배열을 생성하고 각 원소 값을 출력하는 프로그램을 작성하시오. 
 * 배열 생성은 배열을 생성하여 
 * 각 원소의 인덱스 값으로 초기화하여 반환하는 메소드를 이용한다*/
public class _ReturnArray {

	static int[] MakeArray() {//정수형 배열 리턴하는 메소드
		
		int temp[]=new int[4];
		for(int i=0;i<temp.length;i++) 
		{
			temp[i]=i;
		}
		return temp;//temp에 저장된 값은 배열의 첫번째 원소의 주소
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array;//배열 레퍼런스 변수 선언
		array=MakeArray();/*메소드를 호출하고 메소드가 
								리턴한 배열을 전달 받는다.*/
		//배열의 모든 원소 출력
		
		for(int count=0;count<array.length;count++) {
			System.out.println(array[count]);
		}
		}

}
