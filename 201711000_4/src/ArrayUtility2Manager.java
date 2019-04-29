/*실습 1번 메인함수*/
public class ArrayUtility2Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,2,3,4,5};
		int[] array2= {2,4,6,8,10};
		//concat 함수 
		int[] arrayConcat=new int[array1.length+array2.length];
		
		arrayConcat=ArrayUtility2.concat(array1,array2);
		//concat 결과 출력
		System.out.print("[");
		for(int i=0;i<arrayConcat.length-1;i++) {
			System.out.print(arrayConcat[i]+",");
		}
		System.out.println(arrayConcat[arrayConcat.length-1]+"]");
		
		//Remove함수
		int len=ArrayUtility2.remove(array1,array2).length;
		int[] arrayRemove=new int[len];
		
		arrayRemove=ArrayUtility2.remove(array1,array2);
		
		//remove 결과 출력
		System.out.print("[");
		for(int i=0;i<arrayRemove.length-1;i++) {
			System.out.print(arrayRemove[i]+",");
		}
		System.out.println(arrayRemove[arrayRemove.length-1]+"]");
		
		
		

	}

}
