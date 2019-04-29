import java.lang.Math;
public class MathEx {

	public static void main(String[] args) {
		double a=-2.78987434;
		
		// 절대값 구하기
		System.out.println(Math.abs(a));
		// ceil
		System.out.println(Math.ceil(a));
		// floor
		System.out.println(Math.floor(a));
		// 제곱근
		System.out.println(Math.sqrt(a));
		// exp
		System.out.println(Math.exp(a));
		// rint
		System.out.println(Math.rint(a));
		// [1,45] 사이의 난수 발생
		
		System.out.print("이번주 행운의 번호는 ");
		for(int i=0;i<5;i++) {
			System.out.print(((int)(Math.random()*45)+1)+" ");
		}
	}

}
