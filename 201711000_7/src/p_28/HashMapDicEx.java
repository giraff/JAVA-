package p_28;
import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		//영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String,String> dic=new HashMap<String,String>();
		
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		
		Set<String> keys=dic.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			String value=dic.get(key);
			System.out.println("("+key+","+value+")");

		}
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print("찾고 싶은 단어는? ");
			String eng=sc.nextLine();
			System.out.println(dic.get(eng));
		}
	}

}
