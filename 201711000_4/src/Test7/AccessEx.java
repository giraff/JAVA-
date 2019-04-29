package Test7;

class Sample {
	public int a;
	private int b;
	int c;
	protected int d;
   
}
public class AccessEx {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10;  error,the field Sample.b is not visible.
		
		/*Sample 클래스의 필드변수 b는 private 변수이다.
		 * 이것은 같은 클래스내에서만 직접 접근가능하고,
		 * 다른 클래스에서는 aClass.b이런식으로 접근이 불가하다.
		 * private변수를다른 클래스에서 접근하려면
		 * get이나 set 함수를 선언하여 이용해야한다.*/
		aClass.c = 10;
		aClass.d = 10;
	}
}
