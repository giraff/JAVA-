package Test4;
/*예제 4-4 : 배열의 전달
 * char 배열을 메소드의 인자로 전달받아 배열 속의 공백(' ')문자를
 * ','로 대치하는 함수 "replaceSpace"와 char배열을 메소드의 
 * 인자로 전달받아 출력하는 함수 "printCharArray"를 작성*/
public class ArrayParameter {

	static void printCharArray(char[] c){
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+"");
		}
		System.out.println();
	}
	static void replaceSpace(char[] c) {
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ') {
				c[i]=',';
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c= {'T','h','i','s',' ','i','s',' ','a',' ','P','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);

	}

}
