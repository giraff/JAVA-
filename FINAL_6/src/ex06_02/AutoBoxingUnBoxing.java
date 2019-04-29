package ex06_02;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		int i=10;//기본타입
		Integer intObject=i;//자동박싱
		System.out.println("intObject="+intObject);
		
		i=intObject;
		i=i+10;
		System.out.println("i="+i);
	}

}
