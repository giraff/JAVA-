/*예제 3-6
 * while과 break문 이용, -1 입력될때까지 반복 입력한 수의 개수 출력*/
import java.util.*;
public class _BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		int count=0;
		int i=0;
		while(true) {
			System.out.print("정수 입력:");
			i=sc.nextInt();
			if(i==-1)
				break;
			count++;
		}
		System.out.println("입력된 숫자의 개수는 "+count+"개");

	}

}
