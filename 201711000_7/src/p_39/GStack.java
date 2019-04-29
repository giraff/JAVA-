package p_39;

public class GStack<T> {
	int tos;
	Object[] stack; //배열을 하나 갖고있다.
	public GStack() {
		tos=0;
		stack=new Object[10]; //업캐스팅에 의해서 Object 타입
	}
	public void push(T item) {
		if(tos==10) {
			return ;
		}
		stack[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0) {
			return null;
		}
		tos--;
		return (T)stack[tos];
	}
}
/*업캐스팅: 자식 개체를 부모의 레퍼러스 변수에 넣을 수 있다.
 * 여기서 사용자가 어떤 타입의 요소를 넣을 지 모르게 된다. 
 * 배열의 요소 타입을 모르기때문에, 엘리먼트 요소의 가장 상위 클래스가 오브젝트라서
 * 타입을 오브젝트라고 하고, 리턴할 때 (T)라고 타입형변환을 해주기도한다.
 * */