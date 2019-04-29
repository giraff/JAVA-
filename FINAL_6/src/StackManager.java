
public class StackManager {

	public static void main(String[] args) {
		MyStack<Integer> stack=new MyStack<Integer>();
		for(int i=0;i<10;i++) {
			stack.push(i);
		}
		int size=stack.link.size();
		
		for(int j=0;j<size;j++) {
			System.out.print(stack.pop()+" ");
		}
	}

}
