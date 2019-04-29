import java.util.Scanner;
public class PhoneBook {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int person;
		
		System.out.print("인원수>>");
		person=sc.nextInt();
		
		//객체배열 생성
		Phone[] p=new Phone[person];
		
		//객체배열의 요소에 각각의 객체 생성
		for(int i=0;i<p.length;i++) {
			p[i]=new Phone();
		}
		
		//객체에 값 저장
		
		for(int i=0;i<p.length;i++) {
			System.out.print("이름,전화번호>>>");
			p[i].setName(sc.next());
			p[i].setTel(sc.nextLine());
		}
		System.out.println("저장되었습니다.");
		//확인
//		for(int i=0;i<p.length;i++) {
//			System.out.print("이름:"+p[i].getName());
//			System.out.println("번호:"+p[i].getTel());
//		}
		//객체 값 출력.
		while(true) {
			String searchName=null;
			int index=-1;
			System.out.print("검색할 이름>>>");
			searchName=sc.next();
			
			if(searchName.equals("그만")) {
				System.out.println("종료");
				break;
			}
			else {
				for(int i=0;i<p.length;i++) {
					if(searchName.equals(p[i].getName())){	
						index=i;
					}	
				}
				if(index!=-1) {
					p[index].show();
				}
				else {
					System.out.println(searchName+"님은 없습니다.");
				}
			}
		}
	}
}