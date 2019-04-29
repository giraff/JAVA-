package Practice1;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hashtable<String,Student> table=new Hashtable<String,Student>();
		for(int i=0;i<5;i++) {
			System.out.print("이름,학과,학번,학점평균 입력:");
			String name=sc.next();
			String dept=sc.next();
			String stId=sc.next();
			double grades=sc.nextDouble();		
			table.put(stId,new Student(name,dept,stId,grades));
		}
		System.out.print("검색할 학생의 학번:");
		String ID=sc.next();
		Student std=null;
		std=table.search(ID);
		System.out.println("<이름> : "+std.name+"\n<학과> : "+std.dept+"\n<학점 평균> : "+std.Grades);
	}
}
/*하나의 학생 정보는 Student 클래스로 표현한다. Student
 * 클래스에는 이름,학과,학번, 학점 평균을 나타내는 필드가 있다.
 * 콘솔에서 학생 정보 5개를 입력받아 학번을 key로 하여 
 * hashtable에 저장하고 학번으로 학생 정보를
 * 검색하여 정보를 출력하는 프로그램 작성 (제네릭) */