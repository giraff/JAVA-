package Test8;

class CurrencyConverter{
	private static double rate;
	
	static void setRate(int r){
		rate=r;
	}
	public static double toDollar(int KWR) {
		return KWR/rate;
	}
	public static double toKWR(int Dollar) {
		return Dollar*rate;
	}
}
public class StaticMember {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1121);//미국 달러 환율 설정
		System.out.println("백만원은 "+CurrencyConverter.toDollar(1000000)+"달러입니다.");
		System.out.println("백달러는 "+CurrencyConverter.toKWR(100)+"원 입니다.");

	}

}
