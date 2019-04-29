/*예제 3-4
 * 중첩반복문(for)
 * 한줄에 한단씩 구구단 출력 1~9단까지
 * 1단 ...
 * 2단 ...
 * 3단 ...*/
public class _NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j; //i=단
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
		

	}

}
