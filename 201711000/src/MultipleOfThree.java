import java.util.Scanner;
public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int mof=sc.nextInt();
		if((mof%3)==0) System.out.println("3의 배수 입니다.");
		else System.out.println("3의 배수가 아닙니다.");
	}

}
