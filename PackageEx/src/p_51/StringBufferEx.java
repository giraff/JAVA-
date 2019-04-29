package p_51;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This");
		System.out.println(sb.hashCode());
		//문자열 덧붙이기 + is Pencil
		sb=sb.append(" is Pencil");
		System.out.println(sb);
		//문자열 "my"삽입
		sb=sb.insert(7," my");
		System.out.println(sb);
		//문자열 "my"를 "your"로 대치
		sb=sb.replace(8,10,"Your");
		System.out.println(sb);
		//스트링 버퍼 내 문자열 길이 설정
		sb.setLength(4);
		System.out.println(sb);
		
		System.out.println(sb.hashCode());
	}

}
/*
 * java.lang.StringBuffer : 스트링과 달리 
 * 객체 생성 후 , 스트링 값 변경 가능 
 * append와 insert메소드 통해 스트링 조작. 
 * StringBuffer 객체의 크기는 스트링 길이에 따라 가변적
 * 
 * 생성자 : 
 * 	StringBuffer sb=new StringBuffer("java");
 * StringBuffer()  초기 버퍼의 크기가 16인 스트링버퍼 객체 생성
 * StringBuffer(charSequence seq) : seq가 저장하는 일련의 문자들을 포함하는 스트링 버퍼 생성
 * StringBuffer(int capacity) : 지정된 초기 크기를 갖는 스트링버퍼 생성
 * StringBuffer(String str): 저장된 스트링으로 초기화된 스트링버퍼 생성
 * StringBuffer append(String str):str스트링을 스트링 버퍼에 덧붙인다.
 * StringBuffer append(StringBuffer sb):sb스트링 버퍼를 현재의 스트링버퍼에 덧붙인다. 
 * 이결과 현재 스트링 버퍼의 내용이 변한다.
 * int capacity() 현재 스트링버퍼의 크기리턴
 * StringBuffer delete(int start,int end):
 * start 위치에서 end가 지정하는 문자의 앞까지 스트링 제거
 * StringBuffer insert(int offset,String str):
 * str스트링을 스트링버퍼의 offset위치에 삽입.
 * StringBuffer replace(int start,int end,String str):
 * */
