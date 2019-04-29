package p_28;
import java.util.HashMap;
public class ex {
	public static void main(String[] args) {
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("apple","사과");
		String kor=h.get("apple");//"apple"키 값으로 검색 , kor는 "사과"
		System.out.println(kor);
	}
}
