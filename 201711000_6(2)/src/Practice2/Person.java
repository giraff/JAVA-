package Practice2;

import java.util.Scanner;

public class Person {
	String p1,p2;
	public Person() {
	}

	void getName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		System.out.print("첫번째 유저 : ");
		this.p1 = sc.next();
		System.out.print("두번째 유저 : ");
		this.p2 = sc.next();
	}
}

