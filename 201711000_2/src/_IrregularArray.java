/*예제 3-11
 * 10 11 12
 * 20 21
 * 30 31 32
 * 40 41
 * 비정방형 배열 */
public class _IrregularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] i= {{10,11,12},
				    {20,21},
				    {30,31,32},
				    {40,41}};//걍 선언하세요
		int k,s;
		for(k=0;k<i.length;k++,System.out.println()) {
			for(s=0;s<i[k].length;s++,System.out.print(" "))
				System.out.print(i[k][s]);
		}
	}

}
