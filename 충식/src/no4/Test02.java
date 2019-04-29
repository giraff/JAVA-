
package no4;

import java.util.Random;

public class Test02 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd=new Random();
		int[] arr3= new int[5];
		//랜덤한 숫자 넣기
		for(int ar=0;ar<arr3.length;ar++) {
			System.out.print("["+(arr3[ar]=(rd.nextInt(10)+1))+"]");
		}
		//합과 평균
		double sum=0;
		for(int ar=0;ar<arr3.length;ar++) {
			sum+=arr3[ar];
		}
		double ave=(sum/arr3.length);
		System.out.println("\nsum:"+sum+"\nave:"+ave);
	}

}
