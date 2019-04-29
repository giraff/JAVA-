package no7;

public class AccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account("441-0290-1203",600000,7.3);//객체 생성
		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);
		
		//account 기본정보 출력
		System.out.print("계좌정보:"+account.getAccount());
		System.out.println(" 현재 잔액:"+account.getBalance());
		//20000원 입금
		account.deposit(20000);
		System.out.print("계좌정보:"+account.getAccount());
		System.out.println(" 현재 잔액:"+account.getBalance());
		System.out.println("이자:"+account.calculateInterest());
	}

}
