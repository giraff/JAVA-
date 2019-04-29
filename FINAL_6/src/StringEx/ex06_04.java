package StringEx;
import java.lang.String;
public class ex06_04 {

	public static void main(String[] args) {
		String a=new String(" abcd");
		String b=new String(",efg");
		// 문자열 연결 concat
		String str=a.concat(b);
		System.out.println(str);
		// 공백 제거 trim
		str=str.trim();
		System.out.println(str);
			
		// 문자열 대치 replace
		str=str.replace("ab","12");
		System.out.println(str);

		// 문자열 분리 split
		String[] s1=str.split(",",0);
		System.out.println("분리된 0번 문자열:"+s1[0]);
		System.out.println("분리된 1번 문자열:"+s1[1]);

		// 서브 스트링 
		str=str.substring(3);
		System.out.println(str);

		// 문자열의 문자
		char c=str.charAt(2);
		System.out.println();
	}

}
