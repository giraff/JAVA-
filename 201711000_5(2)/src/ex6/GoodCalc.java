package ex6;

public class GoodCalc extends Calculator{
//추상화 클래스 Calculator의 추상화 메소드는 서브 클래스에서 오버라이딩(구현)해주면 된다.
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public double average(int[] a) {
		int len,sum=0;
		for(len=0;len<a.length;len++) {
			sum+=a[len];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		Calculator c=new GoodCalc();
		System.out.println("add(2,3):"+c.add(2,3));
		System.out.println("sub(2,3):"+c.subtract(2,3));
		System.out.println("ave[a]:"+c.average(new int[] {2,3,4}));
	}

}
