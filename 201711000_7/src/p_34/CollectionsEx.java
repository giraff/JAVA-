package p_34;
/*예제 7-8*/
import java.util.*;

public class CollectionsEx {
	static void printList(LinkedList<String> l) {
		Iterator<String>iterator=l.iterator();
		while(iterator.hasNext()) {
			String e=iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator="->";
			}
			else {
				separator="\n";
			}
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList=new LinkedList<String>();
		//요소 삽입
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		//인덱스에 해당하는 중간위치에 삽입
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		//문자열 정렬
		System.out.println("///문자열 정렬");
		Collections.sort(myList);
		printList(myList);//요소 출력
		//반대로 정렬
		System.out.println("///반대로 정렬");
		Collections.reverse(myList);
		printList(myList);
		
		//이진검색
		int index=Collections.binarySearch(myList,"아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
	}

}
