package Practice2;

import java.util.Scanner;
import java.lang.Math;

class GambleGame extends Person{
	int num[] = new int[3];
	String name;

	void game(String name) {
		Scanner sc = new Scanner(System.in);
		this.name = name;
		System.out.print(this.name);
		sc.nextLine();
		
		for(int i = 0; i <3; i++) {
			num[i] = (int)(Math.random() * 4);
			System.out.print(num[i] + "  ");
		}
		System.out.println();
	}
	boolean winner() {
		if(num[0] == num[1] && num[1] == num[2]) {
			System.out.println(name + "이(가) 승리했습니다.");
			return true;
		}
		return false;
	}
	void question() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임을 종료하시겠습니까? ( y / n) ");
		String ch = sc.next();
		if(ch.equals("y") || ch.equals("Y")) {
			System.out.println("종료하겠습니다.");
			System.exit(0);
		}
	}
}
public class GamblingGame {
	public static void main(String args[]) {
		GambleGame gg = new GambleGame();
		String name[] = new String[2];
		gg.getName();
		name[0] = gg.p1;
		name[1] = gg.p2;
		while(true) {
			for(int i = 0; i < 2; i++) {
				gg.game(name[i]);
				if(gg.winner())		
					gg.question();
			}
		}
	}
}