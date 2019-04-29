
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array=new int[5];
		Array[0]=0;
		
		try {
			for(int i=0;i<5;i++) {
				Array[i+1]=i+1+Array[i];
				System.out.println("Array["+i+"]="+Array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	
	}

}
