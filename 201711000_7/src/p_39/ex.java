package p_39;
import java.util.*;

public class ex {
	
	public static void main(String[] args) {
		MyClass<String> s=new MyClass<String>();
		s.set("hello");
		System.out.println(s.get());
		
		MyClass<Integer> n=new MyClass<Integer>();
		n.set(5);
		System.out.println(n.get());
	}
}
