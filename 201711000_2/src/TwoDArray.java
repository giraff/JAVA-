
//실습4
import java.util.Random;//랜덤 클래스 

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();// 랜덤 클래스에 대한 객체 설정
		int[][] ran_eight = new int[4][4];

		// 배열에 랜덤하게 원소 삽입.
		for (int i = 1; i < 9; i++) {
			/* 8번의 횟수로,범위 1~10의 정수를 랜덤한 위치에 삽입 */
			int x=rd.nextInt(4);
			int y=rd.nextInt(4);
			if(ran_eight[x][y]==0) {
				ran_eight[x][y] = rd.nextInt(10) + 1;
			}else {
				i--;
			}
				
		}

		// 배열 출력
		System.out.println("<랜덤 배열 출력>");
		for (int i = 0; i < ran_eight.length; i++, System.out.println()) {
			for (int j = 0; j < ran_eight[0].length; j++) {
				System.out.print("[" + ran_eight[i][j] + "]");
			}
		}
	}

}
/*
 * random.nextBoolean();==>true of false random.nextFloat();==>range:0.0f~1.0f
 * random.nextInt();==>range:all 2^32 possible int values nextInt() 메소드는 파라미터를
 * 이용해 원하는 범위 내의 양수값(range:0~(파라미터)-1)을 가져올 수 있다.
 */
