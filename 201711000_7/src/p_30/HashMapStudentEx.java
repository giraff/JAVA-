package p_30;
import java.util.*;
public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String,Student> map=new HashMap<String,Student>();
		
		//3명의 학생 저장
		map.put("황기태",new Student(1,"010-111-1111"));
		map.put("한원선",new Student(2,"010-222-2222"));
		map.put("이영희",new Student(3,"010-333-3333"));
		
		System.out.println("HashMap의 요소 개수:"+map.size());
		
		//모든 학생 출력, map에 들어있는 모든 (key,value)쌍 출력
		//key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys=map.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String name=it.next();
			Student stu=map.get(name);
			System.out.println(name+":"+stu.id+" "+stu.tel);
		}
		//set이기 때문에 순서가 뒤죽박죽되게 되는데, 이점 유의
	}

}
