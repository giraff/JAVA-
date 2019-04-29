package p_34;

public class WrapperClassEx {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		char c='4';
		Double d=new Double(3.1234566);
		System.out.println(Character.toLowerCase('A'));
		if(Character.isDigit(c)) {//c가 숫자냐?
			System.out.println(Character.getNumericValue(c));
		}//그렇다면 c의 숫자값을 뽑아라.
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toBinaryString(28));//11100
		System.out.println(Integer.toHexString(28));//1c
		System.out.println(i.doubleValue());//10.0
		System.out.println(d.toString());//"3.1234566"
		System.out.println(Double.parseDouble("44.13e-6"));//4.413E-5

	}

}
