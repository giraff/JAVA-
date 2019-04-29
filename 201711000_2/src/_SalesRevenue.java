//예제 3-10
public class _SalesRevenue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Three_total=0d;//지난 3년간 매출 총액
		int size=0,i,j;
		double ave_total=0d;
		int[][] intArray= {{90,90,110,110},
						   {120,110,100,110},
						   {120,140,130,150}};
		size=(intArray.length)*(intArray[0].length);//행의 개수(3)와 열의 개수(4)
		//3년간 총매출
		for(i=0;i<intArray.length;i++) {
			for(j=0;j<intArray[0].length;j++) {
				Three_total+=intArray[i][j];
			}
		}
		
		//연평균 매출 (총매출에서 3년 나누기)
		ave_total=Three_total/intArray.length;
		
		//출력
		System.out.print("지난 3년간 매출 총액은 "+Three_total+"이며 ");
		System.out.println("연평균 매출은 "+ave_total+"입니다.");

	}

}
