/*실습1
 *키보드로부터 정수를 10개 입력 받아 배열에 
 *저장하고 증가하는 순서로 정렬하고 
 *이들을 출력하는 프로그램을 작성하라. */
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//배열 선언, 배열에 원소 저장
		int[] bubble=new int[10];
		for(int i=0;i<bubble.length;i++) {
			bubble[i]=sc.nextInt();
		}
		
		//Bubble sort
		for(int i=0;i<(bubble.length);i++) {
			for(int j=0;j<(bubble.length-1);j++) {
				if(bubble[j]>bubble[j+1]) {
					int temp=0;
					temp=bubble[j];
					bubble[j]=bubble[j+1];
					bubble[j+1]=temp;
				}
			}
		}
		//배열 출력
		for(int count=0;count<bubble.length;count++) {
			System.out.print(bubble[count]+" ");
		}
	}

}
