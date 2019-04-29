package Practice2;
import java.util.*;

public class practice2 <T> implements Stack<T> {

	LinkedList link=new LinkedList();
	public T pop() {
		T elements;
		elements=(T)link.pop();
		return elements;
	}
	public boolean push(T ob) {
		link.push(ob);
		if(link.contains(ob)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {	practice2 <Integer> stack=new practice2<Integer>();
		for(int i=0;i<10;i++) {
			stack.push(i);
		}
		int size=stack.link.size();
		for(int i=0;i<size;i++) {
			System.out.println(stack.pop());
		}
	}
}
