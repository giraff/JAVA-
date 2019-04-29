package lab3;
public interface Stack {
	public int length();
	public Object pop1();
	public Boolean push(Object ob);
}

class StringStack implements Stack{
	Object stack;
	public StringStack() {
		this.stack="";
	}
	public int length() {
		return stack.toString().length();
	}
	public Object pop1() {
		return stack;
	}
	@Override
	public Boolean push(Object ob) {
		// TODO Auto-generated method stub
		this.stack=ob;
		if(this.stack.equals(""))
			return false;
		else
			return true;
	}
}


