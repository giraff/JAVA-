package p_58;
import java.lang.Math;
import java.util.Random;
public class MathEx {

	public static void main(String[] args) {
		double a=-2.78987434;
		//절대값 구하기
		System.out.println(Math.abs(a));
		//ceil
		System.out.println(Math.ceil(a));
		//floor
		System.out.println(Math.floor(a));
		//제곱근
		System.out.println(Math.sqrt(9.0));
		//exp
		System.out.println(Math.exp(1.5));
		//rint
		System.out.println(Math.rint(3.141592));
		//[1,45]사이의 난수 발생
		System.out.print("이번주 행운의 번호는 ");
		for(int i=0;i<5;i++) {
			System.out.print(Math.round(1+Math.random()*44)+" ");
			
		}
		System.out.print("입니다.");

	}

}
