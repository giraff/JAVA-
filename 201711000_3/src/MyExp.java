//예제 4-2
public class MyExp {

	int base;//밑(양의 정수)
	int Exp;//지수(양의 정수)
	
	int getValue() { 
		int sqr=1;
		for(int i=0;i<Exp;i++) {
			sqr*=base;
		}
		return sqr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyExp number1=new MyExp();
		number1.base=2;
		number1.Exp=3;
		
		MyExp number2=new MyExp();
		number2.base=3;
		number2.Exp=4;
		
		System.out.println("2의 3승:"+number1.getValue());
		System.out.println("3의 4승:"+number2.getValue());
	}

}
