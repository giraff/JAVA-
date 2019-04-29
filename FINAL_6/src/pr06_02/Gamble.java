package pr06_02;
import java.util.Scanner;

public class Gamble extends Person{
	int[] num=new int[3];
	String name;
	
	void GoGamble(String name) {
		Scanner sc=new Scanner(System.in);
		
		this.name=name;
		System.out.print(this.name);
		sc.nextLine();
		
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*4);//0~3
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	
	boolean Winner() {
		if(num[0]==num[1]&&num[1]==num[2]&&num[2]==num[0]) {
			System.out.println(this.name+"이(가) 게임에서 이겼습니다.");
			return true;
		}
		else {
			return false;
		}
	}
	void question() {
		Scanner sc=new Scanner(System.in);
		System.out.println("게임을 계속하시겠습니까?(Y/N)");
		String result=sc.nextLine();
		if(result.equals("N")||result.equals("n")) {
			System.out.println("\n ---종료하겠습니다.---\n");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Gamble gg=new Gamble();
		String[] player=new String[2];
		gg.IAmPlayer();
		player[0]=gg.p1;
		player[1]=gg.p2;
		while(true) {
			for(int i=0;i<player.length;i++) {
				String name=player[i];
				gg.GoGamble(name);
				if(gg.Winner()) {
					gg.question();
				}
			}
		}
	}
}
