package p_37;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Integer intObject=i;
		//auto boxing
		System.out.println("intObject="+intObject);
		
		//auto unboxing
		i=intObject;
		System.out.println("i="+i);
	}

}
