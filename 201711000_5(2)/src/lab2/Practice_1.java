package lab2;
import java.util.Scanner;
public class Practice_1{
	DObject start=null,n=null,obj=null;
	static Scanner sc=new Scanner(System.in);
	
	public int showMainMenu() {
		System.out.print("삽입(1) 삭제(2) 모두보기(3) 종료(4)>>");
		int input =sc.nextInt();
		return input;
	}
	public int showRemoveMenu() {
		System.out.print("삭제할 도형 위치>>");
		int input=sc.nextInt();
		return input;
	}
	public int showObjMenu() {
		System.out.print("도형종류 : Line(1),Rect(2),Circle(3)>>");
		int input=sc.nextInt();
		return input;
	}
	
	public void insert(DObject object) {
		if(start==null) {//아무것도 없으면
			start=object;
			n=start;
		}
		else {
			this.obj=object;//멤버 obj을 object로 설정
			n.next=obj;//현재의 다음을 obj로 설정
			n=obj;//마지막을 obj로 설정
		}
	}
	
	public void remove(int index) {
		DObject p=this.start;//p를 시작으로
		int count=0;
		//첫 값이 null이면 , 비어있는 것
		if(this.start==null) {
			System.out.println("Can't Remove.");
		}
		else if(index==1) {//첫번째 요소를 삭제하는 것이면, 시작을 시작의 next로 대체
			start=start.next;
		}
		else{//그외에 요소
			for(int i=2;i<index;i++) {
				count++;
				p=p.next; //다음 것을 탐색하기 위해 p를 p의 next로 설정
			}
			if(p.next==null) {//입력한 인덱스 값이 초과된 값
				System.out.println("삭제 할 수없습니다.");//입력한 인덱스에 값이 없는 경우
			}
			else {
				p.next=p.next.next;
			}
		}
	}
	
	public void show() {
		DObject p2=start;
		//p2가 null이 될때까지 반복 탐색하여 출력
		while(p2!=null) {
			p2.draw();//p2. 출력
			p2=p2.next;
		}
	}
	public static void main(String[] args) {
		int choice=0;
		Practice_1 manage=new Practice_1();
		
		while(true) {
			choice=manage.showMainMenu();
			if(choice==4) {
				System.out.println("종료");
				break;
			}
			else if(choice==1) {//삽입
				int choiceObj=manage.showObjMenu();
				if(choiceObj==1) {
					manage.insert(new Line());
				}
				else if(choiceObj==2){
					manage.insert(new Rect());
				}
				else if(choiceObj==3) {
					manage.insert(new Circle());
				}
				else{
					System.out.println("잘못 누르셨어요!");
				}
			}
			else if(choice==2) {//삭제
				int idx=manage.showRemoveMenu();
				manage.remove(idx);
			}
			else if(choice==3) {//모두 보기
				manage.show();
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
