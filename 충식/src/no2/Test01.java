package no2;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int joo1,joo2;
		for(joo1=1;joo1<=6;joo1++) {
			for(joo2=1;joo2<=6;joo2++) {
				if((joo1-joo2)>0&&(joo1-joo2)<=3) {
					System.out.println(joo1+"-"+joo2+"="+(joo1-joo2));
				}
			}
		}
	}

}
