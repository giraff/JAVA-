package org.opentutorials.javatutorials.eclipse;
abstract class DObject{
	public DObject next;
	public DObject() {next=null;}
	abstract public void draw();
}

abstract class Person {
	public String name;
	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	//추상 메소드는 서브 클래스에서 오버라이딩하여 구현
	
/*추상 메소드: 선언은 되어 있으나 구현되어있지 않은 메소드
 * 추상 클래스: (1) 추상 메소드를 하나라도 가진 클래스
 * (2) 추상메소드는 하나도 없지만 클래스 앞에 abstract로 선언*/
}
