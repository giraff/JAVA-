package p_29_ex1;

public class Rect {
	int width,height;
	
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public boolean equals(Rect rect) {
		if(width*height==(rect.width*rect.height)){
			return true;
		}
		else {
			return false;
		}	
	}
}
