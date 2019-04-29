package p_42;

import p_39.GStack;
//제네릭 타입의 배열도 클래스도 허용되지 않는다.
public class GenericMethodExample {
	public static <T> GStack<T> reverse(GStack<T> a){
		GStack<T> s=new GStack<T>();
		while(true) {
			T tmp;
			tmp=a.pop();
			if(tmp==null) {
				break;
			}
			else {
				s.push(tmp);
			}
		}
		return s;//새스택을 반환
	}
	public static void main(String[] args) {
		GStack<Double> gs=new GStack<Double>();
		
		for(int i=0;i<5;i++) {
			gs.push(new Double(i));
		}
		gs=reverse(gs);
		for(int i=0;i<5;i++) {
			System.out.println(gs.pop());
		}
	}

}
