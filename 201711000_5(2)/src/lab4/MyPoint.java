package lab4;

abstract class MyPoint {

	int x;
	int y;
	public MyPoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
	protected abstract void move(int x, int y);
	//새로운 x,y위치로 이동,추상메소드 move, int형 인자 x,y
	protected abstract void reverse();
	//(x,y)에서 (y,x)로 위치 이동, 추상메소드 reserve
	
	protected void show() {
		System.out.println(x+","+y);
		//객체의 x와 y를 출력하는 메소드 show
	}
}
