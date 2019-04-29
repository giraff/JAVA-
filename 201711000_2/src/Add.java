//실습3
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<args.length;i++) {//명령행 인자의 개수만큼 반복
			int num=0;
			try{
				num=Integer.parseInt(args[i]);
				}
			catch(java.lang.NumberFormatException e) {
				num=0;
			}
			sum=sum+num;
		}
		System.out.print(sum);
	}

}
/* 정수 변수에다가 실수 형 상수, 문자열 상수,그리고 문자 상수를 정수형 상수로 변환해서 집어넣으면 에러가 발생한다.
 * 1.실수의 경우
 * java.lang.NumberFormatException: For input string: "6.5"
 * 2.문자열의 경우
 * java.lang.NumberFormatException: For input string: "aa"
 * 3.문자의 경우
 * java.lang.NumberFormatException: For input string: "c"
 * 
 * 정수를 제외하고 공통적인 에러가 나는 부분을 보아 try-catch문을 쓰기 적당하다 판단하여 이와 같은 알고리즘을 짰다.
 * */
