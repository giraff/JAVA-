/*예제 3-8 배열의 크기만큼 반복하여 수를 입력받은 뒤, 입력된 수들의 평균*/
import java.util.Scanner;
public class _ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] array=new int[5];
		float sum=0f;
		//반복문
		for(int i=0;i<array.length;i++) {
			System.out.print((i+1)+"번째 수 입력:");
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		//평균 구하기
		float ave=sum/(float)array.length;
		//평균 출력
		System.out.println("배열 원소의 평균은 "+ave+"입니다.");
	}

}
