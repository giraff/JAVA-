package ex06_01;

public class Rect {
	int width;
	int height;
	
	Rect(int a,int b){
		width=a;
		height=b;
	}
	public boolean equals(Object ob) {
		int a=this.width*this.height;
		Rect rect=(Rect)ob;
		if(a==(rect.width*rect.height)) {
			return true;
		}
		else {
			return false;
		}
	}
}
