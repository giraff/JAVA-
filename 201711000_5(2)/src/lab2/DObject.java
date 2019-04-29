package lab2;

abstract public class DObject {

	public DObject next;
	public DObject() {//생성자에서 필드를 null로 초기화
		next=null;
	}
	public abstract void draw();//추상 메소드 draw()선언
}


class Line extends DObject{
	public Line() {//슈퍼클래스의 생성자 호출
		super();
	}
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends DObject{
	public Rect() {
		super();
	}
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject{
	public Circle() {
		super();
	}
	public void draw() {
		System.out.println("Circle");
	}
}