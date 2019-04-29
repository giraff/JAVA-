package Test6;

public class GarbageEx {
	public static void main(String[] args) {
		String a=new String("Good");
		String b=new String("Bad");
		String c=new String("Normal");
		String d,e;
		a=null;
		d=c;
		c=null;
	}
	/*a->"Good"
	 *b->"Bad"
	 *c->"Normal"
	 *---------------------
	 *a:null(Good은 garbage)
	 *b->"Bad"
	 *c:null
	 *d->"NorMal"*/
}
