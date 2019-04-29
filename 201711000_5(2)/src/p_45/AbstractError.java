package p_45;

abstract class DObject{
	public DObject next;
	public DObject() {next=null;}
	abstract public void draw();
}
/*레퍼런스는 만들 수 있어도 추상 클래스의 객체는 만들 수 없다.
그걸 가리키는 레퍼런스는 만들 수 있다.*/
public class AbstractError {
		public static void main(String[] args) {
			DObject obj;
			//obj=new DObject();
			//obj.draw();
	}
}

/*추상 클래스의 상속 2가지 경우
 * (1) 추상 클래스의 단순 상속
 * - 추상 클래스를 상속받아 , 추상 메소드를 구현하지 않으면 서브 클래스도 추상클래스 됨.
 * -서브 클래스도 abstract 로 선언해야 함
 * (2) 추상 클래스의 구현 상속
 * -서브 클래스에서 슈퍼클래스의 추상 메소드 구현 (오버라이딩)
 * -서브 클래스는 추상 클래스 아님.
 * */

