package p_25;

class Point{
	int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
}
public class ObjectProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p= new Point(2,3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
	}

}