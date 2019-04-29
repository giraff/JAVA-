/*실습7.*/
import java.util.Scanner;
public class CompareNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String result=null;
		System.out.print("2자리 정수(10~99)입력:");
		String cmp=sc.next();
		if(cmp.charAt(0)==cmp.charAt(1)) {
			result="같습니다.";
		}
		else {
			result="다릅니다.";
		}

		System.out.println("10의 자리와 1의 자리가 "+result);
	}

}
