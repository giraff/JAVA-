/*실습 2. 반복문을 이용하여 369 게임에서 
 * 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 
 * 1부터 시작하며 99까지 한다. 실행사례는 다음과 같다.
ThreeSixNine.java
3 박수 한번
6 박수 한번*/
public class TreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int TenNum,OneNum;

		for(int i=1;i<100;i++) {
			count=0;
			TenNum=i/10;
			OneNum=i%10;
			if(TenNum==3||TenNum==6||TenNum==9) count=count+1;
			if(OneNum==3||OneNum==6||OneNum==9) count=count+1;
			if(count==0) continue;
			else if(count==1) {
				System.out.println(i+" 박수 짝");
			}
			else {
				System.out.println(i+" 박수 짝짝");
			}
						
		
			
		}
	}

}
