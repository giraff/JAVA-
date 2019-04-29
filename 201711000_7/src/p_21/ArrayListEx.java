package p_21;
import java.util.ArrayList;
import java.util.Scanner;
/*스레드: 일종의 프로세서, 컴퓨터 프로그램이 일반적으로
 * 여러개의 프로세스(스레드)로 구성되어있다.
 * 
 * 예제 7-3*/
public class ArrayListEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> str=new ArrayList<String>();
		
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>>");
			str.add(sc.nextLine());
		}
		//모든 요소 출력
		for(int i=0;i<str.size();i++) {
			String user=str.get(i);
			
			System.out.print(user+" ");
		}
		//가장 긴 요소 출력
		String Max=str.get(0);
		for(int i=0;i<str.size();i++) {
			if(Max.length()<str.get(i).length()) {
				Max=str.get(i);
			}
		}
		System.out.println("\n가장 긴 이름은: "+Max);
	}

}
