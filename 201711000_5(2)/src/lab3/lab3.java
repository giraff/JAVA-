package lab3;
import java.util.Scanner;
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringStack s = new StringStack();
		System.out.print("입력 : ");
		String string = sc.nextLine();
		s.push(string);
		System.out.println("출력 : " + s.pop1());
		System.out.println("길이 : " + s.length());
	}

}
