//예제 3-13
public class _MainParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0d;
		for(int i=0;i<args.length;i++) {
			double n=Double.parseDouble(args[i]);
			sum+=n;
		}
		System.out.println("sum = "+sum);
		System.out.println("average="+(sum/args.length));
	}

}
