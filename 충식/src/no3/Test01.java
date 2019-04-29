package no3;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr2= { {5,5},
						{10,10,10,10,10},
						{20,20,20},
						{30,30,30,30}};
		int sum=0,len=0;
		for(int jul=0;jul<arr2.length;jul++) {
			for(int can=0;can<arr2[jul].length;can++) {
				
				sum=sum+arr2[jul][can];
				len++;
			}
		}
		double ave=sum/(double)len;
		System.out.println("sum:"+sum+"\nave:"+ave);//240
		
	}

}
