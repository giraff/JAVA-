package p_46;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String(" abcd");
		String b=new String(",efg");

		//문자열 연결
		a=a.concat(b);
		System.out.println(a);
		//공백 제거
		a=a.trim();
		System.out.println(a);
		//문자열 대치
		a=a.replace("ab","12");
		System.out.println(a);
		//문자열 분리
		String s[]=a.split(",");
		int idx=0;
		System.out.println("분리된"+idx+"번 문자열:"+s[idx]);
		System.out.println("분리된"+(idx+1)+"번 문자열:"+s[idx+1]);
		//서브 스트림
		a=a.substring(3);
		System.out.println(a);
		//문자열의 문자
		char c=a.charAt(2);
		System.out.println(c);
	
	}

}
