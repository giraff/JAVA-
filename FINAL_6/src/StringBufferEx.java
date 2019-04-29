import java.lang.Object;
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sc=new StringBuffer("This");
		System.out.println(sc.hashCode());
		// 문자열 덧붙이기 append
		sc.append(" is pencil");
		System.out.println(sc);

		// 문자열 “my” 삽입  insert
		sc.insert(8,"my ");
		System.out.println(sc);

//		// 문자열 “my”를 “your”로 대치 replace
		sc.replace(8,10,"your");
		System.out.println(sc);
//
//		// 스트링 버퍼 내 문자열 길이 설정 setlength
		sc.setLength(4);
		System.out.println(sc);
//
		System.out.println(sc.hashCode());
	}
}
