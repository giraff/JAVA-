package p_55;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		StringTokenizer st=new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
		System.out.println();
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
