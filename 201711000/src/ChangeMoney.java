/*실습2*/
import java.util.Scanner;
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fiveman, man, cheon, fivebec, bec, sib;

		System.out.print("돈을 입력하세요:");
		int money = sc.nextInt();
		
		System.out.println(money);
		
		int m=money;
		fiveman=m/50000;
		man=(m%50000)/10000;
		cheon=((m%50000)%10000)/1000;
		m=((m%50000)%10000)%1000;
		fivebec=m/500;
		bec=(m%500)/100;
		sib=((m%500)%100)/10;
		m=((m%500)%100)%10;//m의 값=일원의 개수
		
		System.out.println("5만원권은 "+fiveman+"장\n1만원권은 "+man+"장\n천원권은 "+cheon+"장");
		System.out.println("5백원 "+fivebec+"개\n100원 "+bec+"개\n10원 "+sib+"개\n1원 "+m+"개");
		
		
		
	}

}
