
public class _NumException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringNumber= {"23","12","998","3.141592"};
		try {
			for(int i=0;i<stringNumber.length;i++) {
				System.out.println("숫자로 변환된 값은"+Integer.parseInt(stringNumber[i]));
			}
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
			
	}
}

}
