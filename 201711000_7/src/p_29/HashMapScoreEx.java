package p_29;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
public class HashMapScoreEx {

	public static void main(String[] args) {
//사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String,Integer> javaScore=new HashMap<String,Integer>();
		
		//5개의 점수 저장.
		javaScore.put("한홍진",97);
		javaScore.put("황기태",34);
		javaScore.put("이영희",98);
		javaScore.put("정원석",70);
		javaScore.put("한원석",99);
		
		System.out.println("HashMap의 요소의 개수: "+javaScore.size());
		
		//모든 사람의 점수 출력
		Set<String> keys=javaScore.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String name=it.next();
			int Score=javaScore.get(name);
			System.out.println(name+" : "+Score);
		}
		
	}

}
