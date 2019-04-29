/*실습 4. 전화번호부에 이름과 번호를 기록,
 * 기록하고자 하는 인원수에 맞춰 객체배열 생성.
 * 객체배열에 사용자가 직접 입력토록 하고 (공백 기준 이름/번호)
 * 저장이 완료되면 저장되었습니다 하고종료, 
 * 검색기능: 검색하고자 하는 이름을 누루면 전화번호상에서 그 이름과 대조해
 * 이름 정보가 존재하면 이름과 전화번호를 출력,
 * 존재하지않으면 'ㅇㅇㅇ 이 없습니다.' 라고 출력. */
public class Phone {
	private String name;
	private String tel;
	
	public Phone() {	
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public void show() {
		System.out.println(name+"님의 번호는 "+tel+"입니다.");
	}
}
