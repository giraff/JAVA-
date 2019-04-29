/*실습5.*/
import java.util.Scanner;
public class Game369 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int user=sc.nextInt();
		if((user%10==3)||(user%10==6)||(user%10==9)) {
			if((user/10==3)||(user/10==6)||(user/10==9)) {
				System.out.println("박수 짝짝");
			}
			else {
				System.out.println("박수 짝");
			}
		}
		else {
			if((user/10==3)||(user/10==6)||(user/10==9)) {
				System.out.println("박수 짝");
			}
			else {
				System.out.println(user);
			}
		}

	}

}
