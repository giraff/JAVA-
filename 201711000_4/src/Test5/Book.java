package Test5;
/*예제 4-5: 생성자 정의와 호출*/
public class Book {
	String title;
	String author;
	int ISBN;
	//Book의 생성자는 클래스의 이름과 같음, 리턴타입 지정 안함, 오버로딩 가능, 
	//객체 멤버변수와 메소드 변수의 이름이 같은 경우 this 이용
	public Book() {
		//클래스에 생성자가 하나도 선언되지 않은 경우 컴파일러에 의해 자동생성
		//아무작업없이 단순 리턴, 디폴트 생성자라고도 부름
	}
	public Book(String title,String author,int ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	
	public static void main(String[] args) {
		Book javaBook=new Book("Java JDK","황기태",3333);	
	}
}
