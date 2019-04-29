import java.util.*;
public class MyStack<T> implements Stack<T>{
	LinkedList link=new LinkedList();
	
	public T pop() {
		T element;
		element=(T)link.pop();
		return element;
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
}
