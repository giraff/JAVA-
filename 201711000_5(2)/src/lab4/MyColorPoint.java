package lab4;

public class MyColorPoint extends MyPoint{
		// TODO Auto-generated method stub
	String color;
	public MyColorPoint(int x, int y,String color) {
		super(x, y);	
		this.color=color;
	}
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void reverse() {
		int temp=this.x;
		this.x=y;
		this.y=temp;
	}
	public void show() {
		System.out.println(x+", "+y+", "+this.color);
	}
	public static void main(String[] args) {
		MyColorPoint p=new MyColorPoint(5,6,"blue");
		p.move(3,4);
		p.reverse();
		p.show();
	}

}


