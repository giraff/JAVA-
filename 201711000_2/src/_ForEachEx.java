/*예제 3-9*/
public class _ForEachEx {
	enum Week {월,화,수,목,금,토,일}
 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]num={1,2,3,4,5};
		String names[]= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		
		//아래 for-each에서 k는 num[0],num[1],...,num[4]로 반복됨
		for(int k:num)
			sum+=k;
		System.out.println("합은 "+sum);
		//아래 for-each에서 s는 names[0],names[1],...,names[5]
		for(String s:names) 
			System.out.print(s+" ");
		System.out.println();
		
		for(Week day:Week.values())
			System.out.print(day+"요일 ");//for문은 언제까지 돌지 제어 할수 있다. for each문 다~돌아야돼!
		System.out.println();
	}

}
