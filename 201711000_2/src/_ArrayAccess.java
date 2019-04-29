/*예제 3-7
 * */
import java.util.Scanner;
public class _ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,max;
		//배열 선언 및 초기화
		int[] array={0,0,0,0,0};
		
		//max은 배열 첫 요소로 초기화
		max=array[0];
		
		for(i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("입력된 수 중에서 가장 큰 수는 "+max+"입니다.");
	}

}
