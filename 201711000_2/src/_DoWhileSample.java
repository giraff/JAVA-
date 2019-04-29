/*예제 3-3
 * do-while문으로 'a'부터 'z'까지 출력*/
public class _DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Alp=97; //ASCII 코드에서 char 형 'a'의  int형이 97
		
		do {
			System.out.print((char)Alp); //잠시 강제 형변환을 하는 거지 영원히 형변환 되는 것은 아님
			Alp++;
		}while(Alp<=122);//'z'=122
	}

}
