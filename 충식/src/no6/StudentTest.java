package no6;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu=new Student[3];//객체배열만 생성
		for(int i=0; i<stu.length;i++) {
			stu[i]=new Student();//객체 생성
		}
		
		
	    stu[0].setName("홍길동");
		stu[0].setAge(15);
		stu[0].setHeight(170);
		stu[0].setWeight(80);
		
		stu[1].setName("한사람");
		stu[1].setAge(13);
		stu[1].setHeight(180);
		stu[1].setWeight(70);
		
		stu[2].setName("임걱정");
		stu[2].setAge(16);
		stu[2].setHeight(175);
		stu[2].setWeight(65);
	
		for(int i=0;i<stu.length;i++) {
			System.out.print(stu[i].studentInfo());
		}
		
		
		
		
		
		
		
		int maxage=stu[0].getAge();
		int minage=stu[0].getAge();
		int maxweig=stu[0].getWeight();
		int minweig=stu[0].getWeight();
		int maxhigh=stu[0].getHeight();
		int minhigh=stu[0].getHeight();
		
		String maxageName = null;
		String minageName = null;
		String maxweName = null;
		String minweName = null;
		String maxheName = null;
		String minheName = null;
		
		for(int i=0;i<stu.length;i++) {
			if(maxage<stu[i].getAge()) { 
				maxage=stu[i].getAge();
				maxageName = stu[i].getName();
			}
			if(minage>stu[i].getAge()) {
				minage=stu[i].getAge();
				minageName = stu[i].getName();
			}
			if(maxweig<stu[i].getWeight()) { 
				maxweig=stu[i].getWeight();
				maxweName = stu[i].getName();
			}
			if(minweig>stu[i].getWeight()) {
				minweig=stu[i].getWeight();
				minweName = stu[i].getName();
			}
			if(maxhigh<stu[i].getHeight()) {
				maxhigh=stu[i].getHeight();		
				maxheName = stu[i].getName();
			}
			if(minhigh>stu[i].getHeight()) {
				minhigh=stu[i].getHeight();
				minheName = stu[i].getName();
			}
		}
		
		//출력
		double agesum=(stu[0].getAge())+(stu[1].getAge())+(stu[2].getAge());
		double ageave=agesum/stu.length;
		double heigsum=(stu[0].getHeight())+(stu[1].getHeight())+stu[2].getHeight();
		double heigave=heigsum/stu.length;
		double weigsum=stu[0].getWeight()+stu[1].getWeight()+stu[2].getWeight();
		double weigave=weigsum/stu.length;
		System.out.println("나이의 평균:"+ ageave);
		System.out.println("신장 평균:"+heigave);
		System.out.println("몸무게 평균:"+weigave);
		//
		
		System.out.println("가장 큰 신장:"+maxheName);//180
		System.out.println("가장 작은 신장:"+minheName);//170
		System.out.println("가장 큰 몸무게:"+maxweName);//80
		System.out.println("가장 적은 몸무게:"+minweName);//65
		System.out.println("가장 나이가 많은 학생 : " + maxageName);
		System.out.println("가장 나이가 적은 학생 : " + minageName);

		
		
		
	}

}
