/*예제 3-5
 *for, continue문 이용, 1-100까지 짝수들의 합*/
public class _ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for(i=1;i<=100;i++) {
			if(i%2==1)
				continue;
			sum+=i;
		}
		System.out.println("1부터 100까지 짝수의 합은 "+sum+"입니다.");

	}

}
