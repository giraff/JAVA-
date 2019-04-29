package lab5;
import java.util.Scanner;
public class DicManager {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String kor=null;
		Dictionary dic=new Dictionary();
		System.out.println("*** 한영 단어 검색 프로그램입니다.***");
		while(true) {
			System.out.print("한글 단어?");
			kor=sc.nextLine();
			
			if(kor.equals("그만")) {
				System.out.println("종료");
				break;
			}
			else {
				if(dic.kor2Eng(kor).equals("없습니다")) {
					System.out.println(kor+"는 저의 사전에 "+dic.kor2Eng(kor));
				}
				else {
					System.out.println(kor+"는(은) "+dic.kor2Eng(kor));
				}
			}
		
	}
	}
}
