package p_27;

class Point{
	int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "Point("+x+","+y+")";
	}
}
public class ObjectProperty {
	public static void main(String[] args) {
		Point a=new Point(2,3);
		System.out.println(a.toString());
	}
}
