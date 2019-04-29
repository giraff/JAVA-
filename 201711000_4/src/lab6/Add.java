package lab6;

class Add {
	//2개의 연산자
	private int a;
	private int b;
	//피연산자 값을 객체 내에 저장
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	//
	public int calculate() {
		return a+b;
	}

}
